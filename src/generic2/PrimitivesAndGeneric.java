package generic2;

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}


public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box1<Integer> iBox = new Box1<>();
        iBox.set(125);
        int num = iBox.get();

        System.out.println("num = " + num);
    }
}
