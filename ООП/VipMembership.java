import java.time.LocalDate;
import java.time.LocalTime;

public class VipMembership extends Membership {

    public VipMembership(Owner owner, LocalDate endDate) {
        super(owner, endDate);
    }

    @Override
    public boolean canGym(LocalTime time) {
        return true;
    }

    @Override
    public boolean canPool(LocalTime time) {
        return true;
    }

    @Override
    public boolean canGroup(LocalTime time) {
        return true;
    }
}
