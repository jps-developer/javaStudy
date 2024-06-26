package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
        //ls = new ArrayList<>();

        BinaryOperator<String> lc = (s1, s2) -> {
            if(s1.length() > s2.length())
                return s1;
            else
                return s2;
        };
        String str = ls.stream().reduce("empty@@@@@", lc);
        System.out.println(str);
    }
}
