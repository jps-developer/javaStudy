package likelion.bankapp.Util;

public class InsufficientFundsException extends IllegalArgumentException{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
