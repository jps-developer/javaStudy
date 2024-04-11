package methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class GenerMethod{
    public void sort(List<?> list){
        Collections.reverse(list);
    }
}


public class StaticRef {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,6);
        list = new ArrayList<>(list);

        //Consumer<List<Integer>> consumer = s -> Collections.reverse(s);
        Consumer<List<Integer>> consumer = Collections::reverse;
        consumer.accept(list);
        System.out.println(list);

        GenerMethod gm = new GenerMethod();
        //consumer = s -> gm.sort(s);
        consumer = gm::sort;
        consumer.accept(list);
        System.out.println(list);
    }
}
