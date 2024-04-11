package thread.ship;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<String> java = () -> {
            System.out.println("Callable start");
            Thread.sleep(1000L);
            return "java";
        };

        Callable<String> dev = () -> {
            Thread.sleep(2000L);
            return "dev";
        };

        Callable<String> spring = () -> {
            Thread.sleep(3000L);
            return "spring";
        };

        try{
            List<Future<String>> futures = executorService.invokeAll(Arrays.asList(spring,dev,java));
            System.out.println("--------");
            for (Future<String> future : futures) {
                if(future.isDone()){
                    System.out.println(future.isDone());
                    System.out.println("future = " + future.get());
                }
            }
            System.out.println("--------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        try{
            System.out.println("------");
            String s = executorService.invokeAny(Arrays.asList(java, spring, dev));
            System.out.println(s);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Future<String> javaFuture = executorService.submit(java);
        System.out.println("##########");
        //Thread.sleep(3000L);
        System.out.println(javaFuture.isDone());

        try{
            String s = javaFuture.get();
            System.out.println(javaFuture.isDone());
            System.out.println("s = " + s);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
