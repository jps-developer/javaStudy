package likelion.paymentorder.order;

public class OrderStore {

    public static Order findOrder(String foodName){
        if(foodName.equals("pizza")){
            return new PizzaOrder();
        }else if(foodName.equals("bread")){
            return new BreadOrder();
        }else{
            System.out.println("메뉴판에 음식이 없습니다.");
            return null;
        }
    }
}
