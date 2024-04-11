package lamda;

import java.util.Arrays;
import java.util.List;

public class PredicateMain {
    
    public static int sum(Predicate<Integer> p, List<Integer> lst){
        int s = 0;
        
        for(int n : lst){
            if(p.test(n))
                s += n;
        }
                
        return s;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,4,6,7,11);
        
        int s;
        s = sum(n -> n%2 == 1, list);
        System.out.println("s = " + s);

        s = sum(n-> n%2 != 1, list);
        System.out.println("s = " + s);
    }
    
}
