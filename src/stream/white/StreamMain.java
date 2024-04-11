package stream.white;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("java");
        names.add("spring");
        names.add("scala");
        names.add("html");

        List<String> collect = names.stream()
                .map((s) -> {
                    System.out.println(s);
                    return s.toUpperCase();
                }).collect(Collectors.toList());
        collect.forEach(System.out::println);


        List<Integer> collect2 = names.parallelStream().map(s -> {
            System.out.println(s + "" + Thread.currentThread().getName());
            return s.length();
        }).collect(Collectors.toList());

    }
}
