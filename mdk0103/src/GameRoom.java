import java.util.*;

public class GameRoom {
    private List<Toy> toys = new ArrayList<>();
    private double budget;

    public GameRoom(double budget) {
        this.budget = budget;
    }

    public void addToy(Toy toy) {
        if (getTotalPrice() + toy.getPrice() <= budget) {
            toys.add(toy);
        }
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Toy t : toys) {
            sum += t.getPrice();
        }
        return sum;
    }

    public void sortByPrice() {
        toys.sort(Comparator.comparingDouble(Toy::getPrice));
    }

    public List<Toy> findByAge(int min, int max) {
        List<Toy> result = new ArrayList<>();
        for (Toy t : toys) {
            if (t.getAge() >= min && t.getAge() <= max) {
                result.add(t);
            }
        }
        return result;
    }

    public void printToys() {
        for (Toy t : toys) {
            System.out.println(t);
        }
    }
}
