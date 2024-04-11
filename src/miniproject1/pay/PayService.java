package miniproject1.pay;

public class PayService {
    public void processPay(String payOption, int amount){
        PayStore store = new PayStore();
        Pay pay = store.findPay(payOption);

        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제 성공했습니다.");
        }else{
            System.out.println("결제 실패했습니다.");
        }
    }
}
