package collection.treeset;
/*import java.util.TreeSet;
import java.util.Iterator;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return name + " : " + age;
    }
    @Override
    public int compareTo(Person p)
    {
        return this.age - p.age;
    }
}


public class Comparable {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("seo",30));
        tree.add(new Person("kim",15));
        tree.add(new Person("yoon",20));
        
        for(Person p : tree)
            System.out.println("p = " + p);
    }
}

 */
import java.util.TreeSet;
import java.util.Iterator;


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person p) {
        return p.age - this.age;
    }
}

class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));

        for(Person p : tree)
            System.out.println(p);
    }
}