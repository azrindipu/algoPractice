package design_pattern.strategy.example02;

public class ShoppingItem {
    private String itemName;
    private String itemId;
    private int amount;
    public ShoppingItem(String itemName, String itemId, int amount){
        this.itemName = itemName;
        this.itemId = itemId;
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }
}
