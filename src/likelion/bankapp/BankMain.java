package likelion.bankapp;

import likelion.bankapp.account.Account;
import likelion.bankapp.account.StockAccount;
import likelion.bankapp.bank.Bank;

public class BankMain {
    public BankMain() {
    }

    public static void main(String[] args) {

        BankService  bankService = new BankService();
        Bank toss = bankService.selectBank("TOSS");
        Bank kb = bankService.selectBank("KB");
        Bank kiwoom = bankService.selectBank("KIWOOM");
        //Bank noBank = bankService.selectBank("KAKAO");


        Account springAccount = bankService.createAccount("spring", 2000, toss);
        bankService.requestWithdraw(toss, springAccount, 1000);
        bankService.requestWithdraw(toss, springAccount, 1000);
        bankService.requestDeposit(toss, springAccount, 3000);
        System.out.println("----------------------------------------------------------------------");


        Account jspAccount = bankService.createAccount("jsp", 3000, kiwoom);
        bankService.requestWithdraw(kiwoom, jspAccount, 2000);
        System.out.println("----------------------------------------------------------------------");


        Account javaAccount = bankService.createAccount("java", 5000, kb);
        bankService.requestWithdraw(kb, javaAccount, 2000);
        bankService.requestWithdraw(kb, javaAccount, 1000);
        bankService.requestDeposit(kb, javaAccount, 3000);
        System.out.println("----------------------------------------------------------------------");


        StockAccount stockAccount = bankService.createStockAccount("musk", 10000, kiwoom);
        bankService.requestBuyStock(stockAccount, 20, 500);
        bankService.holdStock(stockAccount);
    }
}
