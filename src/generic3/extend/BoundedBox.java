package generic3.extend;

class Box1<T extends Number>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }

    public int toIntValue(){
        return ob.intValue();
    }
}
public class BoundedBox {
    public static void main(String[] args) {
        Box1<Integer> box1 = new Box1<>();
        box1.set(10);

        int n = box1.toIntValue();
        System.out.println("n = " + n);
    }

}
