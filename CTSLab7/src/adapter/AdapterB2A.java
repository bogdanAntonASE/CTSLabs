package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

    @Override
    public double calculateDiscountB(Customer customer) {

        return this.calculateDiscountA(customer.getNoOrders());
    }
}
