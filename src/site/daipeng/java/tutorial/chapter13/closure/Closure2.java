package site.daipeng.java.tutorial.chapter13.closure;

import java.util.function.IntSupplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 4:40 下午
 **/
public class Closure2 {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> {
            return x + i;
        };
    }

    public static void main(String[] args) {
        Closure2 obj = new Closure2();
        IntSupplier f1 = obj.makeFun(0);
        IntSupplier f2 = obj.makeFun(0);

        System.err.println(f1.getAsInt());
        System.err.println(f2.getAsInt());

    }
}
