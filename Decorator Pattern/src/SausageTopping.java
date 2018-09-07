public class SausageTopping extends PizzaDecorator {
    Pizza pizza;

    public SausageTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 120.0 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Sausage";
    }
}
