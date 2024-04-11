package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

class Box<T>{
    private T ob;

    public void setOb(T ob) {
        this.ob = ob;
    }

    public T getInstance() {
        return ob;
    }
}


public class ConsumerMain {
    public static void main(String[] args) {

        BiConsumer<Box<Integer>, Integer> iConsumer = (b, i) -> b.setOb(i);
        BiConsumer<Box<Double>, Double> dConsumer = (b, i) -> b.setOb(i);

        Box<Integer> ibox = new Box<>();
        Box<Double> dbox = new Box<>();

        iConsumer.accept(ibox, 10);
        dConsumer.accept(dbox, 9.90);

        System.out.println("ibox.getIm = " + ibox.getInstance());
        System.out.println("dbox.getIm = " + dbox.getInstance());
    }
}
