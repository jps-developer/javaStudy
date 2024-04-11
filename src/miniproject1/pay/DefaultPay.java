package miniproject1.pay;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("페이 연결 실패");
        return false;
    }
}
