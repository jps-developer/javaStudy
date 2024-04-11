package oop.payment0;

public class KakaoPay implements Pay {
    public boolean pay(int amount){
        System.out.println("kakao pay system linked~ ");
        System.out.println(amount + "원 결제를 시도합니다.");;
        return true;
    }
}


