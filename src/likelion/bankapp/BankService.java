package likelion.bankapp;

import likelion.bankapp.Util.InsufficientFundsException;
import likelion.bankapp.Util.NoExistBankException;
import likelion.bankapp.Util.StockAccountCreationException;
import likelion.bankapp.account.Account;
import likelion.bankapp.account.StockAccount;
import likelion.bankapp.Util.IdConstructor;
import likelion.bankapp.bank.*;

public class BankService {

    IdConstructor id = IdConstructor.getIdConstructor();

    public Bank selectBank(String type){
        if(type.equals("KB")){
            return new KbBank();
        }else if(type.equals("TOSS")){
            return new TossBank();
        }else if(type.equals("KIWOOM")){
            return new KiwoomBank();
        }else{
            throw new NoExistBankException(type + " <은행>은 존재 하지 않습니다.");
        }
    }

    public Account createAccount(String name, int balance, Bank bank){
        Account account = new Account(id.getAccountNum(), name, balance);
        bank.createAccount(account);
        System.out.println(name + " 고객님의 " + bank.getBankName() + "은행 계좌 번호 : " + account.getAccountNum() +
                " 현재 잔액 : " + balance);
        return account;
    }

    public StockAccount createStockAccount(String name, int balance, Bank bank){
        StockAccount stockAccount = new StockAccount(id.getAccountNum(), name, balance);
        if(bank.createStockAccount(stockAccount)){
            System.out.println("주식 계좌 만들기 성공");
            return stockAccount;
        }else{
            throw new StockAccountCreationException("해당 은행은 주식서비스를 지원 하지 않습니다.");
        }
    }

    public void requestBuyStock(StockAccount account, int stockAmount, int price){
        if(account.getBalance() < stockAmount * price){
            System.out.println("증거금이 부족 합니다. ");
        }else{
            int stockHoldings = account.buyStock(stockAmount, price);
            System.out.println("주식 : " + stockAmount + "주 매수성공 / 보유수량 : " + stockHoldings);
        }

    }

    public void sellStock(StockAccount account, int stockAmount, int price){
        if(account.getStockHoldings() < stockAmount){
            System.out.println("매도할 주식 수량이 부족 합니다. ");
        }else{
            int stockHoldings = account.sellStock(stockAmount, price);
            System.out.println("주식 : " + stockAmount + "주 매도성공 / 보유수량 : " + stockHoldings);
        }
    }

    public void holdStock(StockAccount account){
        System.out.println(account.getName() + " 고객님 주식 보유 수량 : " + account.getStockHoldings());
    }


    public void requestDeposit(Bank bank, Account account, int reqBal){
        Account findAccount = bank.findAccount(account.getAccountNum());
        int preBal = findAccount.getBalance();
        int postBal = findAccount.deposit(reqBal);
        System.out.println(findAccount.getName() + " 고객님의 " + "입금전금액 : " + preBal + " 입금 금액 : " + reqBal +
                " 입금 후 금액 : " + postBal);
        //return bal;
    }
    public void requestWithdraw(Bank bank, Account account, int reqBal){
        int preBal = bank.findAccount(account.getAccountNum()).getBalance();
        if(preBal - reqBal < 0){
            throw new InsufficientFundsException("인출할 금액이 부족 합니다.");
        }
        int postBal = bank.findAccount(account.getAccountNum()).withdraw(reqBal);
        System.out.println(bank.getBankName() + "<은행>" + bank.findAccount(account.getAccountNum()).getName() +
                " 고객님의 입출 전 금액 : " + preBal + " 입출 금액 : " + reqBal +
                " 입출 후 금액 : " + postBal);
        //return bal;
    }
}
