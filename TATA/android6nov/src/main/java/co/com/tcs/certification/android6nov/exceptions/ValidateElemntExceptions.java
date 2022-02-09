package co.com.tcs.certification.android6nov.exceptions;

public class ValidateElemntExceptions extends AssertionError{
    public static final String MESSAGE = "Element is not located";
    public static final String MESSAGE1 = "Button not located";

    public ValidateElemntExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateElemntExceptions(String message) {
        super(message);
    }
}
