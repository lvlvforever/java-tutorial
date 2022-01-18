package site.daipeng.java.tutorial.chapter24;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/16 12:15 上午
 **/
public class CompletableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() ->{
            System.err.println(Thread.currentThread().isDaemon());
        });
        future.join();

        CompletableFuture<Integer> callableFuture = CompletableFuture.supplyAsync(() -> 22);
        System.err.println(callableFuture.get());

    }
}
