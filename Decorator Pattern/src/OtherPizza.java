public class OtherPizza extends Pizza {
    public OtherPizza() {
        description = "Other Pizza";
    }

    @Override
    public double cost() {
        return 500.0;
    }
}
