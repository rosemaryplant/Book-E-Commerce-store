public class InventoryController {
    // InventoryController class definition
    private Inventory model; // The Inventory model object
    private InventoryView view; // The InventoryView object

    // Constructor
    public InventoryController(Inventory model, InventoryView view) {
        this.model = model;
        this.view = view;
    }

    // Functions for handling user input related to the inventory
    public void addItem(String itemName, int quantity) {
        model.AddItem(itemName, quantity);
        view.displayInventory();
    }

    public boolean purchaseItem(String itemName, int quantity) {
        boolean success = model.PurchaseItem(itemName, quantity);
        view.displayInventory();
        return success;
    }
}