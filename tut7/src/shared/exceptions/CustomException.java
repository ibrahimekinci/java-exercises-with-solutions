package shared.exceptions;

public abstract class CustomException extends Exception implements ICustomException {
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
