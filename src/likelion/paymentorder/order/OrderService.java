package likelion.paymentorder.order;

public class OrderService{
    String foodName;

    public OrderService(String foodName) {
        this.foodName = foodName;
    }

    public void prepareOrder() {
        System.out.println(foodName + "을 준비 중입니다.");
    }

    public void serveFood() {
        System.out.println(foodName + " 서빙 완료.");
    }
}
