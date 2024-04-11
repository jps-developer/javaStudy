package acceess.ex;

public class ShoppingCart {
    private Item[] items = new Item[3];
    private int itemCount;

    ShoppingCart(){

    }

    public void addItem(Item item){

        if(itemCount >= items.length ){
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        items[itemCount++] = item;
    }
    public void displayItems(){
        System.out.println("장바구니 상품출력 : ");
        for(int i = 0; i < itemCount; i++){
            System.out.println("상품명 : " + items[i].showItemName() + ", 합계 : " + items[i].getPriceSum());
        }
        System.out.println("전체 가격 합 " + calculateTotalPrice());
    }
    private int calculateTotalPrice(){

        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++){
            totalPrice += items[i].getPriceSum();
        }
        return totalPrice;
    }
}
