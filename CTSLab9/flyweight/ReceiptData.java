package flyweight;

public class ReceiptData {

    // ce se modifica
    private float price;

    public ReceiptData(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
