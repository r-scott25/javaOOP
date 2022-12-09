import java.sql.Timestamp;

public class AccountTransferPaymentEvent implements Event{

    private Long createdTimestamp;
    private String id;

    public AccountTransferPaymentEvent(String id) {
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer their service. "
                + "Reaching out to CTE to remove service from old device.");
    }
}
