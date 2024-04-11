package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierMain {

    public static List<Integer> makeIntList(Supplier<Integer> s, int n){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++)
            list.add(s.get());

        return list;
    }

    public static void showConsumer(String s, int i, BiConsumer<String, Integer> con){
        con.accept(s, i);
    }

    public static void main(String[] args) {
        Supplier<Integer> spr = () ->{
            Random rand = new Random();
            return rand.nextInt(50);
        };

        List<Integer> list = makeIntList(spr, 10);
        System.out.println(list);


        BiConsumer<String, Integer> con = (s, i) -> {
            int l = s.length();
            System.out.println("l = " + l);
            int t = l+i;
            System.out.println("t = " + t);
        };

        showConsumer("abc", 2, con);
    }
}
