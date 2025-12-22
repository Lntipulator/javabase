import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Membership {

    protected Owner owner;
    protected LocalDate registrationDate;
    protected LocalDate endDate;

    public Membership(Owner owner, LocalDate endDate) {
        this.owner = owner;
        this.registrationDate = LocalDate.now();
        this.endDate = endDate;
    }

    public boolean isActive() {
        return !LocalDate.now().isAfter(endDate);
    }

    public Owner getOwner() {
        return owner;
    }

    public abstract boolean canGym(LocalTime time);
    public abstract boolean canPool(LocalTime time);
    public abstract boolean canGroup(LocalTime time);
}
