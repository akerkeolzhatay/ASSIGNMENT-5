public class UserApp {
    private UserView view = new UserView(); // View for user interaction
    private UserViewModel viewModel = new UserViewModel(); // ViewModel to manage user data

    public static void main(String[] args) {
        // Start the application
        UserApp app = new UserApp();
        app.run();
    }

    public void run() {
        // Main loop for menu options
        while (true) {
            int option = view.showMenu(); // Show menu and get option

            switch (option) {
                case 1:
                    // Add a new user
                    String name = view.getUserNameInput();
                    viewModel.addUser(name);
                    System.out.println("User added!");
                    break;
                case 2:
                    // Display all users
                    view.displayUsers(viewModel.getUsers());
                    break;
                case 3:
                    // Exit application
                    System.out.println("Exiting... ");
                    return;
                default:
                    // Handle invalid option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}