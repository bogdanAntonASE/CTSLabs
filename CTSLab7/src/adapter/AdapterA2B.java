package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA {
    @Override
    public double calculateDiscountA(int noOrders) {
        // we can't adapt
//        return this.calculateDiscountB();
        return 0;
    }
}
