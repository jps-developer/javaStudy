package likelion.bankapp;

import java.util.*;

public class KbBank implements Bank{


    Map<Long, Account> store = new HashMap<>();

    @Override
    public String getBankName() {
        return "KB";
    }

    @Override
    public void createAccount(Account account) {
        store.put(account.getId(), account);
    }

    @Override
    public Account findAccount(Long id) {
        return store.get(id);
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(store.values());
    }
}
