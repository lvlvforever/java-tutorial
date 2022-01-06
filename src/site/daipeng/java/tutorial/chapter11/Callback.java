package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 4:36 下午
 **/
interface Incrementable {
    void increment();
}

class MyIncrement {
    public void increment() {
        System.err.println("其他的操作");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.err.println(i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

public class Callback {

    public static void main(String[] args) {
        Callee2 c2 = new Callee2();
        Incrementable incrementable = c2.getCallbackReference();
        incrementable.increment();
        incrementable.increment();
    }
}
