class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    Item item1;
    Item item2;

    public Order(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printBill() {
        double total = item1.price + item2.price;
        System.out.println("--- Receipt ---");
        System.out.println(item1.name + ": $" + item1.price);
        System.out.println(item2.name + ": $" + item2.price);
        System.out.println("---------------");
        System.out.println("Total Cost: $" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Mouse", 20.0);
        Item item2 = new Item("Keyboard", 45.0);

        Order order = new Order(item1, item2);

        order.printBill();
    }
}


