package singleton;

import java.util.concurrent.atomic.AtomicBoolean;

public class Database {
    private static Database INSTANCE;

    static {
        try {
            INSTANCE = new Database();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Database() throws Exception {
        throw new Exception();
    }

    public static Database getInstance() {
        return INSTANCE;
    }
}
