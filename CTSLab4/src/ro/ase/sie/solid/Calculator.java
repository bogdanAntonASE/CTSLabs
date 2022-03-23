package ro.ase.sie.solid;

public final class Calculator {

    public static double calculate(double a, double b, Operation operation) {
        return operation.calculate(a, b);
    }
}
