package likelion.bankapp;

public class BankMain {
    public static void main(String[] args) {
        BankService  bankService = new BankService();

        Bank toss = bankService.selectBank("TOSS");
        Account springAccount = bankService.createAccount("spring", 2000, toss);

        bankService.requestWithdraw(toss, springAccount, 1000);
        bankService.requestWithdraw(toss, springAccount, 1000);
        bankService.requestDeposit(toss, springAccount, 3000);
        System.out.println("----------------------------------------------------------------------");

        Bank kb = bankService.selectBank("KB");
        Account javaAccount = bankService.createAccount("java", 5000, kb);

        bankService.requestWithdraw(kb, springAccount, 2000);
        bankService.requestWithdraw(kb, springAccount, 1000);
        bankService.requestDeposit(kb, springAccount, 3000);
    }
}
