package splitwise.users;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateUserEmail(User user, String email) {
        user.setEmail(email);
    }
    public void updateUserName(User user, String name) {
        user.setName(name);
    }

}
