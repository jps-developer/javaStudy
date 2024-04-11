package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TotalStream {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        String[] str = {"kim", "pil", "su"};
        List<String> lst = Arrays.asList("pizza_good", "chicken_nice", "rice_quick");

        Arrays.stream(ar)
                .filter(n -> n%2 == 1)
                .forEach(System.out::println);

        long count = Arrays.stream(str)
                .filter(s -> s.length() > 2)
                .count();
        System.out.println("count = " + count);

        lst.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);


        BinaryOperator<String> lc = (s1, s2) -> {
            if(s1.length() < s2.length())
                return s2;
            else
                return s1;
        };

        String reduce = lst.stream()
                .reduce("", lc);
        System.out.println("reduce = " + reduce);


        // 요소 하나씩 5개 스트림 생성
        Stream.of(1,2,3,4,5)
                .forEach(n -> System.out.print(n + "\t"));
        // lst가 참조하는 컬렉션 인스턴스 자체로 스트림 1개생성
        Stream.of(lst)
                .forEach(n -> System.out.print(n + "\t"));

        //
        System.out.println();
        lst.stream()
                .flatMap(s -> Arrays.stream(s.split("_")))
                .forEach(n -> System.out.print(n + "\t"));
    }
}
