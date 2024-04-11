package generic3.extend;

class Box2<T>{
    protected T ob;

    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

class SteelBox<T> extends Box2<T>{
    public SteelBox(T o){
        ob = o;
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        Box2<Integer> iBox = new SteelBox<Integer>(123);
        Box2<String> sBox = new SteelBox<>("djsdjsdj");


        System.out.println("sBox.get() = " + sBox.get());
        System.out.println("sBox.get() = " + iBox.get());
    }
}
