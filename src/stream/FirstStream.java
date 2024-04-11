package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStream {
    public static void main(String[] args) {

        /// int
        int[] ar = {1,2,3,4,5};
        IntStream stream = Arrays.stream(ar).filter(n -> n%2 == 1);
        int sum = stream.sum();
        System.out.println("sum = " + sum);

        /// string
        String[] st = {"seo", "kim", "lee"};
        Stream<String> stm = Arrays.stream(st, 0, 2);
        stm.forEach(System.out::println);
        Arrays.stream(st,1,2).forEach(System.out::println);

        /// Collection
        List<String> list = Arrays.asList("park","hee","min");
        list.stream().forEach(System.out::println);

        /// mapping
        list.stream().map(String::length).forEach(System.out::println);

        /// of
        Stream.of("합 격","합","격").forEach(s -> System.out.print(s + "\t"));
        // 리스트 요소들 각각 스트림으로 생성이 아니라 sl 하나 자체(배열에 저장) 스트림으로 형성
        List<String> sl = Arrays.asList("yoon", "su", "tae");
        Stream.of(sl).forEach(s -> System.out.print(s + "\t"));
    }
}