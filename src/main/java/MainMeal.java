public class MainMeal implements Order{
    public String mealName;

    public MainMeal(){
        this.mealName = "Main meal!";
    }

    @Override
    public void serve() {
        System.out.println(mealName + " is being served!...");
    }
}
