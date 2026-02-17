public class Main {
    public static void main(String[] args) {

        GameRoom room = new GameRoom(1000);

        room.addToy(new Car("Маленькая машинка", 100, 3, "маленькая"));
        room.addToy(new Car("Большая машинка", 300, 7, "большая"));
        room.addToy(new Doll("Барби", 200, 5));
        room.addToy(new Ball("Футбольный мяч", 80, 4));
        room.addToy(new Cube("Набор кубиков", 150, 2));

        System.out.println("Все игрушки:");
        room.printToys();

        room.sortByPrice();
        System.out.println("\nСортировка по цене:");
        room.printToys();

        System.out.println("\nИгрушки для возраста 3-6 лет:");
        for (Toy t : room.findByAge(3, 6)) {
            System.out.println(t);
        }
    }
}

