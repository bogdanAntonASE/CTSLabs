package ro.ase.sie.solid;

public final class AddOperation implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
