package stream.white;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}

public class OnlineClassStreamApi {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", true));
        springClasses.add(new OnlineClass(5, "rest api", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(1, "java stream", true));
        javaClasses.add(new OnlineClass(2, "java Optional", true));
        javaClasses.add(new OnlineClass(3, "java Generic", false));

        springClasses.stream().filter(
                c -> c.getTitle().startsWith("spring"))
                .forEach(c -> System.out.println("\t" + c.getId()));

        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(c -> System.out.println("\t" + c.getId()));

        springClasses.stream()
                .map(c -> c.getTitle())
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        List<List<OnlineClass>> dev = new ArrayList<>();
        dev.add(springClasses);
        dev.add(javaClasses);

        dev.stream().flatMap(Collection::stream)
                .forEach(c -> System.out.println(c.getId()));

        Stream.iterate(10, i -> i+1) // 스트림 무한생성 10부터시작
                .skip(10) // 처음 10개 스킵
                .limit(10) // 이후 무한이아니라 10개까지만
                .forEach(System.out::println);

        boolean test = javaClasses.stream().anyMatch(c -> c.getTitle().contains("Stream"));

        List<String> spring = springClasses.stream()
                .filter(c -> c.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList());
        spring.forEach(System.out::println);
    }
}
