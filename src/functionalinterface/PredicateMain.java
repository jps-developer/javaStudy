package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateDemo {
    int sum = 0;
    public static void sum(Predicate<Integer> p, List<Integer> lst) {

        for (Integer i : lst) {
            if(p.test(i))
                System.out.println(i + " ");
        }
    }
}

public class PredicateMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 10 ,12 ,15);

        PredicateDemo.sum(i -> i%2 != 0, list);
    }

}
