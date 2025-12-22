import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Fitness fitness = new Fitness();

        Owner o1 = new Owner(1, "Anna", "Ivanova", 2002);
        Owner o2 = new Owner(2, "Maria", "Petrova", 1999);

        Membership regular = new RegularMembership(
                o1, LocalDate.now().plusDays(30));

        Membership vip = new VipMembership(
                o2, LocalDate.now().plusDays(30));

        fitness.enterGym(regular);
        fitness.enterPool(regular);

        System.out.println("-----");

        fitness.enterGym(vip);
        fitness.enterPool(vip);
        fitness.enterGroup(vip);

        System.out.println("----- СМЕНА АБОНЕМЕНТА -----");

        regular = fitness.changeMembership(regular, true, 60);
        fitness.enterPool(regular);

        System.out.println("----- ЗАКРЫТИЕ -----");
        fitness.closeClub();
    }
}
