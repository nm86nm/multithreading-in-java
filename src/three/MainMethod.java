package three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMethod {
    public static void main(String[] args) {
        /*for(int i=1; i<=5; i++) {
            new Thread(new TextPrinter("Thread number: " + i)).start();
        }*/

        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        ExecutorService newSingleThreadPool = Executors.newSingleThreadExecutor();

        for(int i=1; i<=5; i++)
            newCachedThreadPool.execute(new TextPrinter("newCachedThreadPool: " + i));

        for(int i=1; i<=5; i++)
            newFixedThreadPool.execute(new TextPrinter("newFixedThreadPool: " + i));

        for(int i=1; i<=5; i++)
            newSingleThreadPool.execute(new TextPrinter("newSingleThreadPool: " + i));

        newCachedThreadPool.shutdown();
        newFixedThreadPool.shutdown();
        newSingleThreadPool.shutdown();
    }
}