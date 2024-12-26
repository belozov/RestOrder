import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 2500);
        MenuItem burger = new MenuItem("Burger", 1330);

        Order order1 = new Order();
        order1.addMenuItem(pizza);
        order1.addMenuItem(burger);

        Order order2 = new Order();
        order2.addMenuItem(burger);

        Restaurant restaurant = new Restaurant();
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        restaurant.displayOrderSummary();
    }
}
