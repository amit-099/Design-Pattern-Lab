public class MashroomsTopping extends PizzaDecorator {
    Pizza pizza;

    public MashroomsTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 105.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mashrooms";
    }
}
