package collection.hashset;

import java.util.*;

public class HashMapIteration {


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("seo",10);
        map.put("lee",20);
        map.put("park",30);

        // map은 Collection 인터페이스를 상속받지 않아 반복자를 사용 못하지만
        // key 값만 받아서 사용 할 수 있다.
        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println("key , value = " + key + " : " + map.get(key));
        }
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,4,5);
        list = new ArrayList<>(list);
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        for (Integer i : list) {
            System.out.println("i = " + i);
        }
    }

}
