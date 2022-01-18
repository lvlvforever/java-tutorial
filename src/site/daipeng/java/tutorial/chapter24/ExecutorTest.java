package site.daipeng.java.tutorial.chapter24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 11:13 下午
 **/
public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        es.execute(() -> System.err.println("name"));
        es.shutdown();
        es.shutdownNow();
        es.awaitTermination(10, TimeUnit.HOURS);
    }
}
