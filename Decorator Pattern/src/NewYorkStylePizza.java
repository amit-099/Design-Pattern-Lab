public class NewYorkStylePizza extends Pizza {
    public NewYorkStylePizza() {
        description = "NewYorkStyle Pizza";
    }

    @Override
    public double cost() {
        return 1050.0;
    }
}
