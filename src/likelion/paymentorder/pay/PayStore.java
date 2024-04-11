package likelion.paymentorder.pay;

public class PayStore {

    public static Payment findPay(String payOption){
        if(payOption.equals("TossPay")){
            return new TossPay();
        }else if(payOption.equals("KakaoPay")){
            return new KakaoPay();
        }else{
            return new CashPay();
        }
    }
}
