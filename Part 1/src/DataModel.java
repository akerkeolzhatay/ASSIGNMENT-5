public class DataModel {
    private String data;

    // Initialize with default data
    public DataModel() {
        this.data = "Initial Data";
    }

    // Get current data
    public String getData() {
        return data;
    }

    // Update data with new input
    public void updateData(String newData) {
        this.data = newData;
    }

    // Append additional data to the existing data
    public void appendData(String moreData) {
        this.data += " | " + moreData;
    }
}