package decorator;

public class Main {
    public static void main(String[] args) {
        APizza pizzaBasic = new PizzaBasic();
        System.out.println(pizzaBasic.getIngredients());
        System.out.println(pizzaBasic.getTotalCost());

        APizza pizzaChicken = new PizzaChicken(pizzaBasic);
        System.out.println(pizzaChicken.getIngredients());
        System.out.println(pizzaChicken.getTotalCost());
    }
}
