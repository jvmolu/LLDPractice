package splitwise.expenses;

import splitwise.users.User;

public class PercentageExpense extends Expense{

    public PercentageExpense(String type, double amount) {
        super(type, amount);
    }

    public void divide() {
        for(User user: users) {
            double percentage = (double) (this.amount / 100);
            double amount = (double) (user.getBalance() * percentage);
            user.setBalance(user.getBalance() - amount);
        }
    }
}
