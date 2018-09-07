public class OnionsTopping extends PizzaDecorator {
    Pizza pizza;

    public OnionsTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 55.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onions";
    }
}
