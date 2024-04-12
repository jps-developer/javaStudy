package likelion.bankapp;

import java.util.UUID;

public class Account {

    private String name;
    private int balance;
    private Long id = 0L;

    public int deposit(int balance){
        this.balance += balance;
        return this.balance;
    }

    public int withdraw(int balance){
        this.balance -= balance;
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        id = id++;
    }

}
