public class Owner {
    private int id;
    private String name;
    private String surname;
    private int birthYear;

    public Owner(int id, String name, String surname, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
