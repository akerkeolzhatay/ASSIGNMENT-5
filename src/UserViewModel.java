import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    private List<UserModel> users = new ArrayList<>(); // List to hold user models

    // Add a new user to the list
    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    // Get the list of all users
    public List<UserModel> getUsers() {
        return users;
    }
}
