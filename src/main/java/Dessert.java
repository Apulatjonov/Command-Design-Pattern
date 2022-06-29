public class Dessert implements Order{
    public String dessertName;

    public Dessert(){
        this.dessertName = "Ice Cream!";
    }

    @Override
    public void serve() {
        System.out.println(dessertName + " is being served!...");
    }
}
