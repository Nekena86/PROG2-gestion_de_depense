package gestioDeDepense;

import java.util.List;

public class ExpenseDAO {
   public void expenseNoRefunded(List<Expense> expenses){
       expenses.stream()
               .filter(expense -> expense instanceof RefundableExpense);


   }
}
