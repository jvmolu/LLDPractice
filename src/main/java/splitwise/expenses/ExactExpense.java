package splitwise.expenses;

import splitwise.users.User;

public class ExactExpense extends Expense{
    public ExactExpense(String type, double amount) {
        super(type, amount);
    }

    public void divide() {
        for(User user: users) {
            double amount = (double) (this.amount /users.size());
            user.setBalance(user.getBalance() - amount);
        }
    }

}
