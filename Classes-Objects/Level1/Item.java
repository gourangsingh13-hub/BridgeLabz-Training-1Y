class Item {

    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails(int quantity) {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {

        Item item1 = new Item(1001, "Notebook", 50.0);
        item1.displayDetails(5);
    }
}
