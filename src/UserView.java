import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner scanner = new Scanner(System.in); // Scanner for user input

    // Show menu options and get user's choice
    public int showMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    // Get user's name input
    public String getUserNameInput() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    // Display list of users
    public void displayUsers(List<UserModel> users) {
        System.out.println("User List:");
        for (UserModel user : users) {
            System.out.println("- " + user.getName());
        }
    }
}