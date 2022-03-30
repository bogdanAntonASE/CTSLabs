package singleton;

public class DatabaseTwo {
    private static DatabaseTwo INSTANCE = null;
    private static int noInstances = 0;

    private DatabaseTwo() {

    }

    private static DatabaseTwo getInstance() {
        /*if (INSTANCE == null) {
            synchronized (DatabaseTwo.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DatabaseTwo();
                }
            }
        }
        return INSTANCE;*/

        // double-checked locked needs volatile, use the below approach.
        DatabaseTwo result = INSTANCE;
        if (result != null) // First check (no locking)
            return result;
        synchronized(DatabaseTwo.class) {
            if (INSTANCE == null) // Second check (with locking)
                INSTANCE = new DatabaseTwo();
            return INSTANCE;
        }
    }
}
