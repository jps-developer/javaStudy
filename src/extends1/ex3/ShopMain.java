package extends1.ex3;

public class ShopMain {
    public static void main(String[] args) {
        Item[] items = new Item[3];

        items[0] = new Book("JAVA",15000, "kim", 1414);
        items[1] = new Album("like me", 2000, "kack");
        items[2] = new Movie("trust me", 12000,"yoon","young");


        int sum = 0;
        for (Item item : items) {
            item.print();
            sum += item.getPrice();
        }
        System.out.println("상품 가격의 합 = " + sum);
    }
}
