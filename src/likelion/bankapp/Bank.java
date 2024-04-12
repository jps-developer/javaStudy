package likelion.bankapp;

import java.util.List;
import java.util.UUID;

public interface Bank {

    String getBankName();
    void createAccount(Account account);
    Account findAccount(Long id);
    List<Account> findAll();
}
