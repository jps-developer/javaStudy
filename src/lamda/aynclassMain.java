package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 자바8 부터는 이방식을 지양
class StrComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
*/

public class aynclassMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("adc"); list.add("qwe"); list.add("wzsd");

/*      StrComp cmp = new StrComp();
        Collections.sort(list,cmp);
*/
        // 자바8 부터는 이러한 익명클래스->람다 형식 코드 스타일은 지향해야 한다.
        Comparator<String> cmp = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        };

        System.out.println(list);
    }
}
