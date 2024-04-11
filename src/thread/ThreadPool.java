package thread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class ThreadPool {
    public static void main(String[] args) {

        Function<String, Integer> f = s -> s.length();

        Runnable task = () -> {
            int n1 = 10;
            String n2 = "thread";

            String name = Thread.currentThread().getName();
            int sum = n1 + f.apply(n2);
            System.out.println(name + " = " + sum);
        };

        List<Character> list = new LinkedList<>();

        ExecutorService exr = Executors.newSingleThreadExecutor();
        exr.submit(task);
        exr.submit(() ->
        {
            System.out.println();
            for(char i='A'; i<'Z'+1; i++)
                list.add(i);
            for (Character i : list) {
                System.out.print(" " + i);
            }
        });
        System.out.println();
        System.out.println("end : " + Thread.currentThread().getName());
        exr.shutdown();
    }
}
