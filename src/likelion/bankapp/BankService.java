package likelion.bankapp;

import java.util.UUID;

public class BankService {

    public Bank selectBank(String type){
        if(type.equals("KB")){
            return new KbBank();
        }else if(type.equals("TOSS")){
            return new TossBank();
        }else if(type.equals("KIWOOM")){
            return new KiwoomBank();
        }else{
            return new DefaultBank();
        }
    }

    public Account createAccount(String name, int balance, Bank bank){
        Account account = new Account();
        account.setId();
        account.setName(name);
        account.setBalance(balance);
        bank.createAccount(account);
        System.out.println(name + " 고객님의 " + bank.getBankName() + "은행 계좌 번호 : " + account.getId() + " 현재 잔액 : " + balance);
        return account;
    }
    public void requestDeposit(Bank bank, Account account, int reqBal){
        Account findAccount = bank.findAccount(account.getId());
        int preBal = findAccount.getBalance();
        int postBal = findAccount.deposit(reqBal);
        System.out.println(findAccount.getName() + " 고객님의 " + "입금전금액 : " + preBal + " 입금 후 금액 : " + postBal);
        //return bal;
    }
    public void requestWithdraw(Bank bank, Account account, int reqBal){
        int preBal = bank.findAccount(account.getId()).getBalance();
        if(preBal - reqBal < 0){
            throw new InsufficientFundsException("인출할 금액이 부족 합니다.");
        }
        int postBal = bank.findAccount(account.getId()).withdraw(reqBal);
        System.out.println(bank.getBankName() + "<은행>" + bank.findAccount(account.getId()).getName() + " 고객님의 입출 전 금액 : " + preBal + " 입출 후 금액 : " + postBal);
        //return bal;
    }
}
