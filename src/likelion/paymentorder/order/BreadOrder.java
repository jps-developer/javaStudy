package likelion.paymentorder.order;

public class BreadOrder implements Order {
    int price = 4000;
    @Override
    public boolean foodOrder(int amount) {
        if(amount - price >= 0){
            System.out.println("빵 주문 성공");
            return true;
        }else{
            System.out.println(amount-price + " 원을 더 지불 하셔야 합니다.");
            return false;
        }
    }
}
