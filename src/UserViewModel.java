import java.util.ArrayList;
import java.util.List;

public class UserViewModel {

    private List<UserModel> users = new ArrayList<>();

    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    public List<UserModel> getUsers() {
        return users;
    }
}