package ro.ase.sie.solid;

public class Main {
    public static void main(String[] args) {
        Operation operation = new AddOperation();
        System.out.println(Calculator.calculate(10, 2, operation));
    }
}
