package flyweight;

public class Main {
    public static void main(String[] args) {
        Receipt[] receiptList = new Receipt[50];
        ReceiptData[] receiptDataList = new ReceiptData[50];

        for(int i = 0; i < 50; i++) {
            receiptList[i] = FlyweightFactory.getReceipt(ReceiptType.valueOf("FORMAT_" + (i % 3 + 1)));
            receiptDataList[i] = new ReceiptData(100 + i);
        }

        for(int i = 0; i < 50; i++) {
            receiptList[i].printReceipt(receiptDataList[i]);
        }

        FlyweightFactory.getNoReceipts();
    }
}
