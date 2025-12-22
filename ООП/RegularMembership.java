import java.time.LocalDate;
import java.time.LocalTime;

public class RegularMembership extends Membership {

    public RegularMembership(Owner owner, LocalDate endDate) {
        super(owner, endDate);
    }

    @Override
    public boolean canGym(LocalTime time) {
        int h = time.getHour();
        return h >= 8 && h < 22;
    }

    @Override
    public boolean canPool(LocalTime time) {
        return false;
    }

    @Override
    public boolean canGroup(LocalTime time) {
        return false;
    }
}
