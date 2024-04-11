/*
package thread;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String name2 = thread.getName();
        System.out.println("name = " + name2);


        Runnable task = () ->{
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        };
        
        Thread t = new Thread(task);
        t.start();

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
*/
package thread;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

class Box{
    private int n;

    public Box(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    public int larger(Box b){
        return b.n - this.n;
    }
}

public class MainThread {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOdddT");
        list.add("APPLEe");
        list.add("BOX");

        Comparator<String> cmp = (s1, s2) -> s1.length() -s2.length();

        Collections.sort(list, cmp);
        System.out.println(list);

        Box b1 = new Box(10);
        Box b2 = new Box(20);

        //ToIntBiFunction<Box, Box> bf = (b1, b2) -> b1.larger(b2);
        ToIntBiFunction<Box, Box> bf = Box::larger;
        ToIntFunction<Box> bf1 = Box::getN;

        int len = bf.applyAsInt(b1,b2);
        int len2 = bf1.applyAsInt(b1);
    }
}