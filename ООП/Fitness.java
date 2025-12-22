import java.time.LocalDate;
import java.time.LocalTime;

public class Fitness {

    private Membership[] gym = new Membership[10];
    private Membership[] pool = new Membership[10];
    private Membership[] group = new Membership[10];

    private boolean clubOpen() {
        int h = LocalTime.now().getHour();
        return h >= 6 && h < 24;
    }

    public void enterGym(Membership m) {
        System.out.println("Попытка входа в зал: " + m.getOwner().getFullName());

        if (!clubOpen()) {
            System.out.println("Клуб закрыт");
            return;
        }
        if (!m.isActive()) {
            System.out.println("Абонемент просрочен");
            return;
        }
        if (!m.canGym(LocalTime.now())) {
            System.out.println("Нет доступа в зал");
            return;
        }

        add(gym, m);
        System.out.println("Вход в зал РАЗРЕШЕН");
    }

    public void enterPool(Membership m) {
        System.out.println("Попытка входа в бассейн: " + m.getOwner().getFullName());

        if (!clubOpen() || !m.isActive() || !m.canPool(LocalTime.now())) {
            System.out.println("Вход в бассейн ЗАПРЕЩЕН");
            return;
        }

        add(pool, m);
        System.out.println("Вход в бассейн РАЗРЕШЕН");
    }

    public void enterGroup(Membership m) {
        System.out.println("Попытка входа на групповое занятие: " + m.getOwner().getFullName());

        if (!clubOpen() || !m.isActive() || !m.canGroup(LocalTime.now())) {
            System.out.println("Вход ЗАПРЕЩЕН");
            return;
        }

        add(group, m);
        System.out.println("Вход РАЗРЕШЕН");
    }

    private void add(Membership[] arr, Membership m) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = m;
                return;
            }
        }
    }

    public Membership changeMembership(Membership old, boolean vip, int days) {
        System.out.println("Смена абонемента для " + old.getOwner().getFullName());

        if (vip) {
            return new VipMembership(old.getOwner(),
                    LocalDate.now().plusDays(days));
        } else {
            return new RegularMembership(old.getOwner(),
                    LocalDate.now().plusDays(days));
        }
    }

    public void closeClub() {
        System.out.println("Клуб закрывается, все клиенты выходят");
        clear(gym);
        clear(pool);
        clear(group);
    }

    private void clear(Membership[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }
}
