package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Box<T>{
    private T ob;

    public Box(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class ReportCard {
    private int kor;    // 국어 점수
    private int eng;    // 영어 점수
    private int math;    // 수학 점수

    public ReportCard(int k, int e, int m) {
        kor = k;
        eng = e;
        math = m;
    }
    public int getKor() { return kor; }
    public int getEng() { return eng; }
    public int getMath() { return math; }
}

public class Mapping {

    public static void main(String[] args) {

        // map
        List<Box<String>> lst = Arrays.asList(new Box<>("kim"), new Box<>("Ryu"));
        //lst.stream().map(Box::getOb).forEach(System.out::println);
        lst.stream().map(Box::getOb).mapToInt(String::length).forEach(System.out::println);

        // flatmap
        Stream<String> ss1 = Stream.of("kim_yo", "park_pil");
        Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));
        ss2.forEach(System.out::print);
        System.out.println();

        ReportCard[] cards = {
                new ReportCard(20,20,20),
                new ReportCard(10,10,10),
                new ReportCard(40,40,40)
        };

        Arrays.stream(cards).flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()))
                .peek(System.out::print)
                .average()
                .ifPresent(avg -> System.out.println(" : avg : " + avg));
        System.out.println();

        // sorted
        //Comparator<Integer> cp = (a, b) -> b.compareTo(a);

        int[] ar = {1,2,3,4,5,7,6,0};
        Arrays.stream(ar).sorted()
                .forEach(System.out::print);


        Arrays.stream(cards).mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
                .average()
                .ifPresent(avg -> System.out.println(" : avg : " + avg));
        System.out.println();
    }
}
