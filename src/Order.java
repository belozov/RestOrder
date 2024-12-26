import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        if (items.isEmpty()) {
            System.out.println("The order is empty.");
            return;
        }

        System.out.println("Your order:");
        for (MenuItem item : items) {
            System.out.println("- " + item.getName() + ": "+ String.format("%.2f", item.getPrice()) + " Tenge");
        }
        System.out.println("Total: " + String.format("%.2f", calculateTotal())+ " Tenge");
    }
}