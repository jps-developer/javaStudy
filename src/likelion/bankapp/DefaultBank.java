package likelion.bankapp;

import java.util.List;

public class DefaultBank implements Bank{
    String message;

    public DefaultBank() {
        System.out.println("선택 하신 은행은 존재 하지 않습니다.");
    }

    @Override
    public String getBankName() {
        return null;
    }

    @Override
    public void createAccount(Account account) {

    }

    @Override
    public Account findAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
