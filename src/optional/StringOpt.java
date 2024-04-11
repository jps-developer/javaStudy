package optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class StringOpt {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of(new String("Toy1"));
        Optional<String> os2 = Optional.ofNullable(null);

        if(os1.isPresent()) // true false 반환
            System.out.println(os1.get());
        if(!os2.isPresent())
            System.out.println("os2 = null");

        os1.ifPresent(s -> System.out.println(s));
        os2.ifPresent(s -> System.out.println(s)); // null 이기때문에 실행x

    }
}
