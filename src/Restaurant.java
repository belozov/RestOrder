import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrderSummary () {
        if (orders.isEmpty()) {
            System.out.println("There are no orders");
            return;
        }

        System.out.println("Restaurant Order Summary:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("\nOrder " + (i + 1) + ":");
            orders.get(i).displayOrderDetails();
        }
    }
}