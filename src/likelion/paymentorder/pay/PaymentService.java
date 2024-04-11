package likelion.paymentorder.pay;

public class PaymentService {

    public void processPay(String option, int amount){
        Payment pay = PayStore.findPay(option);
        boolean paymentResult = pay.pay(amount);

        if(paymentResult) {
            System.out.println("페이 결제 성공");
        }else{
            System.out.println("현금 결제");
        }
    }
}
