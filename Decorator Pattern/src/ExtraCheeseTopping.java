public class ExtraCheeseTopping extends PizzaDecorator {
    Pizza pizza;

    public ExtraCheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 65.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra cheese";
    }
}
