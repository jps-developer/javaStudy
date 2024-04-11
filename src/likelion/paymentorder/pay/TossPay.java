package likelion.paymentorder.pay;

import likelion.paymentorder.pay.Payment;

public class TossPay implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.println("토스 페이 " + amount + "원 지불");
        return true;
    }
}
