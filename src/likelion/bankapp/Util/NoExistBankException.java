package likelion.bankapp.Util;

public class NoExistBankException extends IllegalArgumentException{
    public NoExistBankException(String message) {
        super(message);
    }
}
