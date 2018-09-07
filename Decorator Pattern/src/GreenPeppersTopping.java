public class GreenPeppersTopping extends PizzaDecorator {
    Pizza pizza;

    public GreenPeppersTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 85.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Green peppers";
    }
}
