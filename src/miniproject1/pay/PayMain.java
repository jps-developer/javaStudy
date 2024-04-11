package miniproject1.pay;

public class PayMain {
    public static void main(String[] args) {

        PayService service = new PayService();
        int amount = 5000;

        String op1 = "네이버페이";
        service.processPay(op1, amount);

        String op2 = "토스페이";
        service.processPay(op2, amount);
    }
}
