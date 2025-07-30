package gestioDeDepense;

import java.time.LocalDate;

public class RecurringExpense extends Expense{
    recurrence recurrence;

    public RecurringExpense(String label, double amount, LocalDate date) {
        super(label, amount, date);
        this.recurrence = recurrence.MONTHLY;
    }

    @Override
    public String toString() {
        return "RecurringExpense{" +
                "recurrence=" + recurrence +
                '}';
    }
}
