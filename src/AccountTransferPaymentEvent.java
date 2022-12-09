import java.sql.Timestamp;

public class AccountTransferPaymentEvent extends AbstractEvent{

    public AccountTransferPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer their service. "
                + "Reaching out to CTE to remove service from old device.");
    }
}
