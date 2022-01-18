package site.daipeng.java.tutorial.chapter24;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 11:06 下午
 **/
public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 22;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<>(new CallableTest());
        new Thread(futureTask).start();
        System.err.println(futureTask.get());
    }
}
