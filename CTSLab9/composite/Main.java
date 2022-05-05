package composite;

public class Main {
    public static void main(String[] args) {
        Structure menu = new Structure("Menu");

        Structure menuDrinks = new Structure("Drinks");
        Structure menuFood = new Structure("Food");

        menu.addNode(menuDrinks);
        menu.addNode(menuFood);

        menuDrinks.addNode(new Node("Ursus", 5));
        menuDrinks.addNode(new Node("Cotnari", 10   ));

        menuFood.addNode(new Node("Pizza Carbonara", 20));
        menuFood.addNode(new Node("Pizza Margerita", 15));

        menuFood.addNode(new Node("Pasta Margerita", 15));

        System.out.println(menu.getInfo());
    }
}
