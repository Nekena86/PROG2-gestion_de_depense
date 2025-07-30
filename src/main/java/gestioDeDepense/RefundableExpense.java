package gestioDeDepense;

public class RefundableExpense {
    boolean refunded;

    public RefundableExpense(boolean refunded) {
        this.refunded = refunded;
    }
    public void refund(){
        this.refunded = true;
    }
}
