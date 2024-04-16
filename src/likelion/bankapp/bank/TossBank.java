package likelion.bankapp.bank;

import likelion.bankapp.account.Account;

import java.util.*;

public class TossBank implements Bank {


    Map<Long, Account> store = new HashMap<>();

    @Override
    public String getBankName() {
        return "TOSS";
    }

    @Override
    public void createAccount(Account account) {
        store.put(account.getAccountNum(), account);
    }

    @Override
    public Account findAccount(Long id) {
        return store.get(id);
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean createStockAccount(Account account){
        return false;
    }
}
