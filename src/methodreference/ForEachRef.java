package methodreference;

import java.util.Arrays;
import java.util.List;

public class ForEachRef {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("seo","kim","lee");
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
