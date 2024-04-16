package likelion.bankapp.account;

public class Account {

    private String name;
    private int balance;
    private Long accountNum = 0L;

    public Account(Long accountNum, String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.accountNum = accountNum;
    }

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

    public Long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Long accountNum) {
        this.accountNum = accountNum;
    }

}
