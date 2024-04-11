package collection.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;

public class AsListCollection {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(11);
        list.add(21);
        list.add(31);

        for (Integer s : list)
            System.out.println("s = " + s);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 1) {
                itr.remove();
                System.out.println("-");
            }
            System.out.println(itr.next() + ", ");
        }

        itr = list.iterator(); // 반복자를 한번 사용했으면 다시 선언(재사용불가)

        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }


        String[] array = {"사과", "바나나", "오렌지"};

        // 배열을 List로 변환
        List<String> lst = Arrays.asList("kim", "seo", "lee");

        Iterator<String> itr2 = lst.iterator();
        for (String s : lst) {
            System.out.println("lst name = " + s);
        }
    }
}