package ex2;

public enum ProductType {
    CRITICAL_AVAILABILITY(4),
    LOW_AVAILABILITY(3),
    MEDIUM_AVAILABILITY(2),
    HIGH_AVAILABILITY(1);

    private int availability;
    ProductType(int availability) {
        this.availability = availability;
    }

    public int getAvailability() {
        return this.availability;
    }
}
