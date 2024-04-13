public class Item {
    // Item class definition
    private int barcode; // The item's barcode
    private double price; // The item's price
    private boolean reorder; // Whether the item should be reordered
    private int reorderAmount; // The amount to reorder
    private int stock; // The current stock of the item

    // Constructor
    public Item(int barcode, double price, boolean reorder, int reorderAmount, int stock) {
        this.barcode = barcode;
        this.price = price;
        this.reorder = reorder;
        this.reorderAmount = reorderAmount;
        this.stock = stock;
    }

    // Getters and setters for the fields
    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReorder() {
        return reorder;
    }

    public void setReorder(boolean reorder) {
        this.reorder = reorder;
    }

    public int getReorderAmount() {
        return reorderAmount;
    }

    public void setReorderAmount(int reorderAmount) {
        this.reorderAmount = reorderAmount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}