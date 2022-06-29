public class Soup implements Order{
    public String soupName;

    public Soup(){
        this.soupName = "Tomato Soup";
    }

    @Override
    public void serve() {
        System.out.println(soupName + " is being served!...");
    }
}
