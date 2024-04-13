public class ItemController {
    // ItemController class definition
    private Item model; // The Item model object
    private ItemView view; // The ItemView object

    // Constructor
    public ItemController(Item model, ItemView view) {
        this.model = model;
        this.view = view;
    }

    // Functions for handling user input related to the item
    public void updatePrice(double newPrice) {
        model.setPrice(newPrice);
        view.displayItem();
    }

    public void updateStock(int newStock) {
        model.setStock(newStock);
        view.displayItem();
    }
}