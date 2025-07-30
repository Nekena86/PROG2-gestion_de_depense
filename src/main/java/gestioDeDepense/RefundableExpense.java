package gestioDeDepense;

import java.time.LocalDate;

public class RefundableExpense extends Expense {
    private boolean refunded;

    public RefundableExpense(boolean refunded, String label, double amount, LocalDate date) {
        super(label, amount, date);
        this.refunded = refunded;
    }
    public boolean getRefunded() {
        return refunded;
    }

    public void refund(){
        this.refunded = true;
    }
}
