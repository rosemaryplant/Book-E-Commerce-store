public class ItemView {
    // ItemView class definition
    private Item model; // The Item model object

    // Constructor
    public ItemView(Item model) {
        this.model = model;
    }

    // Functions for displaying the item data
    public void displayItem() {
        int barcode = model.getBarcode();
        double price = model.getPrice();
        boolean reorder = model.isReorder();
        int reorderAmount = model.getReorderAmount();
        int stock = model.getStock();
        // Display the item data in a user-friendly format
    }
}