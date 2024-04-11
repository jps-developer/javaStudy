package generic3.extend;

class Pay<T>{
    private T ob;
    public void set(T o){ ob = o; }
    public T get(){ return ob; }
}

class NaverPay{
    private int point;
    public void chargePoint(int p){ point += p; }
    public void usePoint(int p ){ point -= p; }
    public int nowPoint(){ return point; }
    @Override
    public String toString(){
        return "NaverPay";
    }
}

class PayHandler{
    public static void outPay(Pay<? extends NaverPay> pay){
        NaverPay p = pay.get();
        System.out.println(p);
    }
    public static void inBox(Pay<? super NaverPay> pay, NaverPay p){
        pay.set(p);
    }
}


public class BoundedWildcardBase {
    public static void main(String[] args) {
        Pay<NaverPay> pay = new Pay<>();
        PayHandler.inBox(pay, new NaverPay());
        PayHandler.outPay(pay);
    }
}
