import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Fitness fitness = new Fitness();

        Owner o1 = new Owner(1, "Анна", "Ивановна", 2002);
        Owner o2 = new Owner(2, "Глеб", "Петров", 1999);

        Membership regular = new RegularMembership(
                o1, LocalDate.now().plusDays(30));

        Membership vip = new VipMembership(
                o2, LocalDate.now().plusDays(30));

        fitness.enterGym(regular);
        fitness.enterPool(regular);

        System.out.println("-_-");

        fitness.enterGym(vip);
        fitness.enterPool(vip);
        fitness.enterGroup(vip);

        System.out.println("Смена Абонемента");

        regular = fitness.changeMembership(regular, true, 60);
        fitness.enterPool(regular);

        System.out.println("Закрытие");
        fitness.closeClub();
    }
}
