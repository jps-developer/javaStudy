package miniproject1.pay;

public class PayStore {
    public static Pay findPay(String option){

        if(option.equals("카카오페이")){
            return new KakaoPay();
        }
        else if(option.equals("네이버페이")){
            return new NaverPay();
        }
        else{
            return new DefaultPay();
        }
    }
}
