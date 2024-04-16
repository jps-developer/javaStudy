package likelion.bankapp.bank;

import likelion.bankapp.account.Account;

import java.util.List;

public interface Bank {

    String getBankName();
    void createAccount(Account account);
    Account findAccount(Long id);
    List<Account> findAll();
    boolean createStockAccount(Account account);
}
