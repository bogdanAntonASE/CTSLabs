package adapter;

public class DiscountB implements IDiscountB{

    @Override
    public double calculateDiscountB(Customer customer) {
        double total = 0;
        for(int i = 0; i < customer.getNoOrders(); i++) {
            total += customer.getOrdersAmount()[i];
        }

        if (total < 300) {
            return 20;
        }
        else {
            return 30;
        }
    }
}
