package shared.exceptions;

public class CalculationException extends CustomException {
    private static final String DEFAULT_MESSAGE = "Error occurred during calculation.";

    public CalculationException() {
        super(DEFAULT_MESSAGE);
    }

    public CalculationException(String message) {
        super(message);
    }

    @Override
    public String getDefaultMessage() {
        return DEFAULT_MESSAGE;
    }
}
