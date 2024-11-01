public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    // Connect model and view
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    // Main program flow
    public void run() {
        // Display current data
        view.displayCurrentData(model.getData());

        // Get new data from user and update model
        String newData = view.getNewData();
        model.updateData(newData);

        // Show updated data
        System.out.println("Data updated to: " + model.getData());
        System.out.println("Performing more operations...");

        // Get additional data, append it, and display final data
        String moreData = view.getMoreData();
        model.appendData(moreData);
        view.displayFinalData(model.getData());
    }
}
