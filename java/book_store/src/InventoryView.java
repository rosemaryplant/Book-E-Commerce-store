import java.util.Map;

public class InventoryView {
    // InventoryView class definition
    private Inventory model; // The Inventory model object

    // Constructor
    public InventoryView(Inventory model) {
        this.model = model;
    }

    // Functions for displaying the inventory data
    public void displayInventory() {
        Map<String, Item> items = model.getItems();
        int totalQuantity = model.getTotalQuantity();
        // Display the inventory data in a user-friendly format
    }
}