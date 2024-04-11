package generic3.extend;
class BoxFactory{
    public static <T> Box<T> makeBox(T o){
        Box<T> box = new Box<T>();
        box.set(o);
        return box;
    }
}
class Unboxing{
    public static <T> T unboxing(Box<T> box){
        return box.get();
    }
}
class BoxFactory2{
    public static <T extends Number> Box<T> makeBox(T o){
        Box<T> box = new Box<T>();
        box.set(o);
        System.out.println("Box data : " + o.doubleValue());
        return box;
    }
}

class Unboxing2{
    public static <T extends Number> double unboxing(Box<T> box){
        return box.get().doubleValue();
    }
}

public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        Box<String> box = BoxFactory.makeBox("java");
        System.out.println(box.get());
        System.out.println(Unboxing.unboxing(box));

        //Box<String> box2 = BoxFactory2.makeBox("123"); 타입인자 string 불가능
        Box<Double> box2 = BoxFactory2.makeBox(123.1);
        System.out.println("unboxing double + " + Unboxing2.unboxing(box2));

    }
}
