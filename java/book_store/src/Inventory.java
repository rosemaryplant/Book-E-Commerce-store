import java.time.*;
import java.util.Map;

public class Inventory {
    // Inventory class definition
    private Map<String, Item> items; // A map of item names to Item objects
    private int totalQuantity; // The total quantity of all items in inventory
    private LocalDateTime lastPurchaseTime; // The time of the last purchase
    private String emailAddress; // The email address of the inventory manager

    // Constructor
    public Inventory(Map<String, Item> items, int totalQuantity, LocalDateTime lastPurchaseTime, String emailAddress) {
        this.items = items;
        this.totalQuantity = totalQuantity;
        this.lastPurchaseTime = lastPurchaseTime;
        this.emailAddress = emailAddress;
    }

    // Functions
    public boolean PurchaseItem(String itemName, int quantity) {
        // Purchase an item and update the inventory
        Item item = items.get(itemName);
        if (item!= null && item.getQuantity() >= quantity) {
            item.setQuantity(item.getQuantity() - quantity);
            totalQuantity -= quantity;
            // Update lastPurchaseTime and send email notification if necessary
            return true;
        }
        return false;
    }

    public void AddItem(String itemName, int quantity) {
        // Add an item to the inventory
        Item item = items.get(itemName);
        if (item == null) {
            item = new Item(itemName, quantity);
            items.put(itemName, item);
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
        totalQuantity += quantity;
    }

    public void Recorder() {
        // Record inventory transactions
    }

    public void Email() {
        // Send an email notification
    }

    // Getters and setters for the fields
    public Map<String, Item> getItems() {
        return items;
    }

    public void setItems(Map<String, Item> items) {
        this.items = items;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public LocalDateTime getLastPurchaseTime() {
        return lastPurchaseTime;
    }

    public void setLastPurchaseTime(LocalDateTime lastPurchaseTime) {
        this.lastPurchaseTime = lastPurchaseTime;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}