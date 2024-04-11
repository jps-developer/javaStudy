package generic3.extend;

class Unboxer{
    public static <T> T openBox(Box<T> box){
        return box.get();
    }

    public static void peekBox(Box<? extends Number> box){
        System.out.println(box);
    }
}

class Box11<T>{
    private T ob;

    public void set(T o){
        this.ob = o;
    }

    public T get(){
        return ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }
}


public class WildcardUnbox {
    public static void main(String[] args) {
        //Box<String> box = new Box<>();
        //box.set("sample box test");
        //Unboxer.peekBox(box);

        Box<Double> dBox = new Box<>();
        dBox.set(123.1);
    }
}
