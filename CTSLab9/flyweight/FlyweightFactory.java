package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<ReceiptType, Receipt> mapReceipt = new HashMap<>();

    public static Receipt getReceipt(ReceiptType type) {
        Receipt receipt = mapReceipt.get(type);
        if (receipt == null) {
            receipt = new Receipt(type);
            mapReceipt.put(type, receipt);
        }
        return receipt;
    }

    public static void getNoReceipts() {
        System.out.println(mapReceipt.size());
    }
}
