public class UserApp {
    private UserView view = new UserView();
    private UserViewModel viewModel = new UserViewModel();

    public static void main(String[] args) {
        UserApp app = new UserApp();
        app.run();
    }

    public void run() {
        while (true) {
            int option = view.showMenu();

            switch (option) {
                case 1:
                    String name = view.getUserNameInput();
                    viewModel.addUser(name);
                    System.out.println("User added!");
                    break;
                case 2:
                    view.displayUsers(viewModel.getUsers());
                    break;
                case 3:
                    System.out.println("Exiting... ");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
