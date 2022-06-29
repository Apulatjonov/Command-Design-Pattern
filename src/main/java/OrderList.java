import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private List<Order> orders;

    public OrderList(){
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
