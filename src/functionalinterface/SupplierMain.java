package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierMain {
    public static List<Integer> MakeIntLIst(IntSupplier s, int n)
    {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++)
            list.add(s.getAsInt());

        return list;
    }

    public static void main(String[] args) {
        IntSupplier spr = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
        };

        List<Integer> list = MakeIntLIst(spr, 10);
        System.out.println(list);
    }
}
