public class Car extends Toy {
    private String size;

    public Car(String name, double price, int age, String size) {
        super(name, "Машина", price, age);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return super.toString() + ", Размер: " + size;
    }
}
