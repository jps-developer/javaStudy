package likelion.paymentorder.pay;

public class CashPay implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.println("현금 " + amount + "원 지불");
        return true;
    }
}
