package ex2;

public class DiscountCalculator {

    public static float calculateDiscountBasedOnProductAvailabilityAndClient(ProductType productType, float productPrice, int percentageDiscount)
    {
        float discount = (percentageDiscount > 10) ? (float)30/100 : (float)percentageDiscount/100;
        float[] productTypeDiscounts = {0f, 0.1f, 0.25f, 0.35f};

        if (productType.getAvailability() <= ProductType.CRITICAL_AVAILABILITY.getAvailability() && productType.getAvailability() >= ProductType.HIGH_AVAILABILITY.getAvailability()) {
            if (productType.getAvailability() == 1)
            {
                return productPrice;
            }
            else {
                final float v = productPrice - (productTypeDiscounts[productType.getAvailability() - 1] * productPrice);
                return v - discount * v;
            }
        }
        return 0;
    }
}

