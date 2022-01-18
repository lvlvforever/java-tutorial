package site.daipeng.java.tutorial.chapter24;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 11:00 下午
 **/
public class ThreadTest extends Thread{
    @Override
    public void run() {
        System.err.println("ThreadTest");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        Thread t = new Thread(new MyThread());
        t.start();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.err.println("MyThread");
    }
}
