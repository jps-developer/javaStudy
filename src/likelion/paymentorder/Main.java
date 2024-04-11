package likelion.paymentorder;

import likelion.paymentorder.order.Order;
import likelion.paymentorder.order.OrderService;
import likelion.paymentorder.order.OrderStore;
import likelion.paymentorder.pay.PaymentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("주문할 음식을 선택해주세요. 1. pizza 1만원 2. bread 4천원");
        String foodName = scanner.nextLine();
        System.out.println("지불할 금액을 선택해주세요.");
        int amount = scanner.nextInt();

        Order orderName = OrderStore.findOrder(foodName);
        if(orderName.foodOrder(10000)){
            PaymentService paymentService = new PaymentService();
            paymentService.processPay("TossPay", amount);

            OrderService orderService = new OrderService(foodName);
        }else{
            System.out.println("주문실패");
        }



    }


}
