package three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMethod {
    public static void main(String[] args) {
        /*for(int i=1; i<=5; i++) {
            new Thread(new TextPrinter("Thread number: " + i)).start();
        }*/

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1; i<=5; i++)
            executorService.execute(new TextPrinter("Text number " + i));

        executorService.shutdown();
    }
}