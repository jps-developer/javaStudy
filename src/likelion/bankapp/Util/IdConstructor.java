package likelion.bankapp.Util;

public class IdConstructor {
    private static final IdConstructor idConstructor = new IdConstructor();
    private Long accountNum = 0L;

    private IdConstructor(){};

    public static IdConstructor getIdConstructor(){
        return idConstructor;
    }

    public Long getAccountNum() {
        return accountNum++;
    }
}
