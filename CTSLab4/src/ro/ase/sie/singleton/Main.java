package ro.ase.sie.singleton;

public class Main {

    public static void main(String[] args) {
        Database db1 = Database.connect();
        Database db2 = Database.connect();

        System.out.println(db1);
        System.out.println(db2);
    }
}
