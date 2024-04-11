package likelion.paymentorder.order;

import likelion.paymentorder.order.Order;

public class PizzaOrder implements Order {

    int price = 10000;
    @Override
    public boolean foodOrder(int amount) {
        if(price - amount >= 0){
            System.out.println("피자 주문 성공");
            return true;
        }else{
            System.out.println(amount-price + " 원을 더 지불 하셔야 합니다.");
            return false;
        }

    }
}
