public abstract class Toy implements ToyType {
    private String name;
    private String type;
    private double price;
    private int age;

    public Toy(String name, String type, double price, int age) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Название: " + name +
                ", Тип: " + type +
                ", Цена: " + price +
                ", Возраст: " + age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;
        Toy t = (Toy) o;
        return name.equals(t.name) && type.equals(t.type);
    }
}
