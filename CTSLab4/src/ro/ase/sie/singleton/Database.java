package ro.ase.sie.singleton;

public class Database {

    private String connectionString="www.mydb.ro";
    private static Database databaseInstance;

    private Database () {
    }

    public static Database connect() {
        // connect to db
        if (databaseInstance == null) {
            databaseInstance = new Database();
        }
        return databaseInstance;
    }
}
