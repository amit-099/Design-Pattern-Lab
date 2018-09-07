public class OtherTopping extends PizzaDecorator {
    Pizza pizza;

    public OtherTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 20.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Other Topping";
    }
}
