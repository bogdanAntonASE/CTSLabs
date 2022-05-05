package flyweight;

public class Receipt implements IReceipt {

    private final String name = "Bogdan SRL";
    private ReceiptType type;

    public Receipt(ReceiptType type) {
        this.type = type;
    }

    @Override
    public void printReceipt(ReceiptData receiptData) {
        System.out.println("Restaurant: " + this.name + "; Type: " + this.type + "; Price: " + receiptData.getPrice());
    }
}
