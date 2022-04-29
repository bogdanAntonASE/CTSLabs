package decorator;

public class PizzaDecorator extends APizza {
    protected APizza aPizza;

    public PizzaDecorator(APizza pizza) {
        this.aPizza = pizza;
    }

    @Override
    public String getIngredients() {
        return aPizza.getIngredients();
    }

    @Override
    public float getTotalCost() {
        return aPizza.getTotalCost();
    }
}
