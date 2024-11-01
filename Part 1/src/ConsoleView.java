import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    // Set up scanner for user input
    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    // Display current data to the user
    public void displayCurrentData(String data) {
        System.out.println("Current Data: " + data);
    }

    // Get new data from user input
    public String getNewData() {
        System.out.print("Enter new data: ");
        return scanner.nextLine();
    }

    // Get additional data from user input
    public String getMoreData() {
        System.out.print("Enter another piece of data: ");
        return scanner.nextLine();
    }

    // Display final combined data
    public void displayFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
