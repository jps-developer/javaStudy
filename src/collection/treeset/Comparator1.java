package collection.treeset;

import com.sun.source.tree.Tree;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class Menu implements Comparable<Menu>{
    private int price;
    private String name;

    public Menu(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Menu m) {
        return this.name.length() - m.name.length();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
class MenuComparator implements Comparator<Menu>{
    @Override
    public int compare(Menu o1, Menu o2) {
        return o2.getPrice() - o1.getPrice();
    }
}


public class Comparator1{
    public static void main(String[] args) {
        TreeSet<Menu> treeSet = new TreeSet<>(new MenuComparator());
        treeSet.add(new Menu(1000,"치킨"));
        treeSet.add(new Menu(4000,"짜장면"));
        treeSet.add(new Menu(2000,"샌드위치"));


        for(Iterator<Menu> itr = treeSet.iterator(); itr.hasNext();)
            System.out.println(itr.next());
        for (Menu menu : treeSet) {
            System.out.println("menu = " + menu);
        }
    }
}