package decorator;

public class PizzaChicken extends PizzaDecorator {

    public PizzaChicken(APizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", chicken";
    }

    @Override
    public float getTotalCost() {
        return super.getTotalCost() + 10;
    }
}
