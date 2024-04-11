package generic2;

class Box1<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

public class BoxInBox {
    public static void main(String[] args) {
        Box1<String> sBox = new Box1<>();
        sBox.set("single box");

        Box1<Box1<String>> dBox = new Box1<>();
        dBox.set(sBox);

        Box1<Box1<Box1<String>>> tBox = new Box1<>();
        tBox.set(dBox);

        System.out.println(tBox.get().get().get());
    }
}
