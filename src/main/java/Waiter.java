import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Order> orders;

    public Waiter(){
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void serveOrders(){
        for (Order order: orders) {
            order.serve();
        }
        orders.clear();
    }

}
