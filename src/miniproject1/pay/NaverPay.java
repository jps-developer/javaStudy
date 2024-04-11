package miniproject1.pay;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("Naver pay system linked~ ");
        System.out.println(amount + "원 결제를 시도합니다.");;
        return true;
    }
}
