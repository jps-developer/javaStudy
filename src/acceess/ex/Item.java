package acceess.ex;

public class Item {
    private String name;
    private int price;
    private int count;

    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String showItemName(){
        return name;
    }

    public int getPriceSum(){
        return price * count;
    }
}
