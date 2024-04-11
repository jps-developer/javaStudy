package collection.treeset;

import java.util.*;

public class OverlapRemove {
    public static void main(String[] args) {
        // List인터페이스를 구현하는 컬렉션 프레임워크는 생성과 동시에 초기화를 할 수 없다.
        // 따라서 배열의 asList를 통해 생성과 동시에 초기화 한다.
        List<String> lst = Arrays.asList("Box","Box","Seo","Box","Pil");
        // asList의 반환되는 참조값으로 ArrayList or LinkedList로 받을수 없어서 다시 할당
        //lst = new ArrayList<>(lst);
        lst = new LinkedList<>(lst);

        for(String s : lst)
            System.out.println(".toString() = " + s.toString());

        HashSet<String> set = new HashSet<>(lst);
        lst = new ArrayList<>(set);

        for(String s : lst)
            System.out.println("set.toString() = " + s.toString());
    }
}


