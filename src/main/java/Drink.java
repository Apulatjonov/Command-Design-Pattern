public class Drink implements Order{
    public String drinkName;

    public Drink(){
        this.drinkName = "Coffee";
    }

    @Override
    public void serve() {
        System.out.println(drinkName + " is being served!...");
    }
}
