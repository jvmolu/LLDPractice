package splitwise.expenses;

import splitwise.users.User;

import java.util.ArrayList;

public abstract class Expense {

    String type;
    double amount;

    ArrayList<User> users;

    public Expense(String type, double amount) {
        this.type = type;
        this.amount = amount;
        users = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
