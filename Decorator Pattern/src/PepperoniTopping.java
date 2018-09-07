public class PepperoniTopping extends PizzaDecorator {
    Pizza pizza;

    public PepperoniTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 92.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }
}
