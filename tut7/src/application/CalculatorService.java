package application;

import domain.ICalculator;
import shared.exceptions.CalculationException;

public final class CalculatorService implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws CalculationException {
        if (b == 0) {
            throw new CalculationException("Cannot divide by zero.");
        }
        return a / b;
    }
}
