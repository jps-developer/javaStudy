package generic3.wildcard;

class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
    @Override
    public String toString(){
        return "Box~";
    }
}

class Toy{
    @Override
    public String toString(){
        return "Toy~";
    }
}
class BoxContentsMover{
    public static void moveBox(Box<? extends Toy> from, Box<? super Toy > to)
    {
        to.set(from.get());
    }
}


public class MoveBoxContents {
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        box1.set(new Toy());
        Box<Toy> box2 = new Box<>();

        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
