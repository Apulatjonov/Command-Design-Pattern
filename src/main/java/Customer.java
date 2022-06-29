public class Customer {
    public static void main(String[] args) {
        Drink drink = new Drink();
        MainMeal meal = new MainMeal();
        Soup soup = new Soup();
        Dessert dessert = new Dessert();

        Waiter orderList = new Waiter();

        orderList.takeOrder(drink);
        orderList.takeOrder(meal);
        orderList.takeOrder(dessert);
        orderList.serveOrders();
        System.out.println("----------------");
        orderList.takeOrder(soup);
        orderList.takeOrder(drink);
        orderList.takeOrder(dessert);
        orderList.serveOrders();
    }
}
