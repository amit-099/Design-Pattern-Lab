public class BlackOlivesTopping extends PizzaDecorator {
    Pizza pizza;

    public BlackOlivesTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 60.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Black Olives";
    }
}
