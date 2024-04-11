package likelion.paymentorder.pay;

public class KakaoPay implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.println("카카오 페이 " + amount + "원 지불");
        return true;
    }
}
