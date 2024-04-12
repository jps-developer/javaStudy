package likelion.bankapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KiwoomBank implements Bank{


    Map<Long, Account> store = new HashMap<>();

    @Override
    public String getBankName() {
        return "KIWOOM";
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
