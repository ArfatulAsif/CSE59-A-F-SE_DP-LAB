
class Item{
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;

    }
}

class Order{
    private Item item1;
    private Item item2;
    public Order(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printBill(){
        double totalCost = item1.price + item2.price;
        System.out.println("--- Order Bill ---");
        System.out.println(item1.name + ": $" + item1.price);
        System.out.println(item2.name + ": $" + item2.price);
        System.out.println("------------------");
        System.out.println("Total Cost: $" + totalCost);
    }
}



public class main8 {
    public static void main(String[] args) {
        Item itemA = new Item("Mouse",20.0);
        Item itemB = new Item("Keyboard",45.0);

        Order myOrder = new Order(itemA, itemB);
        myOrder.printBill();

    }
}
