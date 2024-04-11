package methodreference;

import java.util.function.Function;

interface SMaker{
    String make(char[] ar);
}

public class ConstructorRef {
    public static String chsToString(char[] a, SMaker m){
        return m.make(a);
    }

    public static void main(String[] args) {
        SMaker ms = ar -> {
            return new String(ar);
        };

        char[] src = {'R', 'o', 'b', 'o', 't'};
        String str1 = ms.make(src);
        System.out.println("str1 = " + str1);

        // 위에 긴 코드를 생성자 메서드 참조 3줄로 끝낼 수 있다.

        Function<char[], String> f = String::new;
        String str2 = f.apply(src);
        System.out.println("str2 = " + str2);
    }
}
