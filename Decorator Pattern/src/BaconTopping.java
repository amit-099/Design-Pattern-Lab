public class BaconTopping extends PizzaDecorator {
    Pizza pizza;

    public BaconTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 25.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }
}
