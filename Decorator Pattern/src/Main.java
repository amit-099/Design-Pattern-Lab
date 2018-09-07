import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza;
        System.out.println("Enter Pizza Type: (Beef/Chicken/Chicago/NewYork/Others)");

        String pizzaType = sc.next();

        if(pizzaType.equals("Beef") || pizzaType.equals("beef")) pizza = new BeefPizza();
        else if(pizzaType.equals("Chicken") || pizzaType.equals("chicken")) pizza = new ChickenPizza();
        else if(pizzaType.equals("Chicago") || pizzaType.equals("chicago")) pizza = new ChicagoPizza();
        else if(pizzaType.equals("NewYork") || pizzaType.equals("newyork")) pizza = new NewYorkStylePizza();
        else pizza = new OtherPizza();

        System.out.println("Enter Toppings: (Bacon/BlackOlive/ExtraCheese/GreenPeeper/Mashroom/Onion/Pepperoni/Sausage/Others)");
        System.out.println("Enter 0 to complete order: ");

        while(true) {
            String toppingType = sc.next();

            if(toppingType.equals("0")) break;

            if (toppingType.equals("Bacon") || toppingType.equals("bacon")) pizza = new BaconTopping(pizza);
            else if(toppingType.equals("BlackOlive") || toppingType.equals("blackolive")) pizza = new BlackOlivesTopping(pizza);
            else if(toppingType.equals("ExtraCheese") || toppingType.equals("extracheese")) pizza = new ExtraCheeseTopping(pizza);
            else if(toppingType.equals("GreenPeeper") || toppingType.equals("geenpeeper")) pizza = new GreenPeppersTopping(pizza);
            else if(toppingType.equals("Mashroom") || toppingType.equals("mashroom")) pizza = new MashroomsTopping(pizza);
            else if(toppingType.equals("Onion") || toppingType.equals("onion")) pizza = new OnionsTopping(pizza);
            else if(toppingType.equals("Pepperoni") || toppingType.equals("pepperoni")) pizza = new PepperoniTopping(pizza);
            else if(toppingType.equals("Sausage") || toppingType.equals("sausage")) pizza = new SausageTopping(pizza);
            else pizza = new OtherTopping(pizza);
        }

        System.out.println("You have ordered: " + pizza.getDescription() + " topping");
        System.out.println("Please Pay " + pizza.cost() +" taka");
    }
}
