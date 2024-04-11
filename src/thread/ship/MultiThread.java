package thread.ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class HelloThread extends Thread{
    @Override
    public void run() {
        System.out.println("world : " + Thread.currentThread().getName());
    }
}

public class MultiThread {
    public static void main(String[] args) {

        Runnable task = () -> {
            int n1 = 10;
            String n2 = "thread";

            String name = Thread.currentThread().getName();

            System.out.println(name + " = " + n2);
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit( ()-> {
            System.out.println("---------------");
            System.out.println("world : " + Thread.currentThread().getName());
            System.out.println("---------------");
        });
        executorService.shutdown();

        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        executorService2.submit(getRunnable("dsd"));
        executorService2.submit(getRunnable("222"));
        executorService2.submit(getRunnable("333"));
        executorService2.submit(getRunnable("444"));
        executorService2.submit(getRunnable("555"));
        executorService2.submit(task);

        ScheduledExecutorService executorService3 = Executors.newSingleThreadScheduledExecutor();
        executorService3.schedule(getRunnable("3초뒤실행"), 3, TimeUnit.SECONDS);
        //executorService3.scheduleWithFixedDelay(getRunnable("1초대기후2초마다실행"),1, 2, TimeUnit.SECONDS);
        //executorService3.shutdown();
    }

    public static Runnable getRunnable(String text) {
        return () -> System.out.println(text + Thread.currentThread().getName());
    }
}
