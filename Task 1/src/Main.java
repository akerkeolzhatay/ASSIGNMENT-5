import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize data with default value
        String data = "Initial Data";

        // Set up scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display current data
        System.out.println("Current Data: " + data);

        // Get new data from user and update
        System.out.print("Enter new data: ");
        data = scanner.nextLine();
        System.out.println("Data updated to: " + data);

        System.out.println("Performing more operations...");

        // Get more data from user
        System.out.print("Enter another piece of data: ");
        String moreData = scanner.nextLine();
        System.out.println("More data: " + moreData);

        // Append more data to the existing data
        data = data + " | " + moreData;

        // Display final combined data
        System.out.println("Final combined data: " + data);
    }
}
