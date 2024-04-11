package collection.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member{
    private Long id;
    private int age;
    private String name;

    public Member(){}

    public Member(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class MapUpdate {
    public static void main(String[] args) {
        Map<Long, Member> store = new HashMap<>();
        Member member1 = new Member(1L,10,"Tset1");
        Member member2 = new Member(2L,20,"Tset2");
        Member member3 = new Member(3L,30,"Tset3");
        Member member4 = new Member();
        member4.setAge(40);

        store.put(member1.getId(), member4);
        store.put(member2.getId(), member2);
        store.put(member3.getId(), member3);



        Set<Long> keySet = store.keySet();
        for (Long l : keySet) {
            System.out.println("id : " + l + " name : " + store.get(l).getName() + " age : " + store.get(l).getAge());
        }
    }
}
