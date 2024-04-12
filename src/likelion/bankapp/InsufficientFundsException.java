package likelion.bankapp;

public class InsufficientFundsException extends IllegalArgumentException{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
