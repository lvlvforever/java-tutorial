package site.daipeng.java.tutorial.chapter13.closure;

import java.util.function.IntSupplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 4:40 下午
 **/
public class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
//        return () -> x++ + i++;
        return () -> x + i;
    }

    public static void main(String[] args) {
        Closure3 obj = new Closure3();
        IntSupplier f1 = obj.makeFun(0);
        IntSupplier f2 = obj.makeFun(0);

        System.err.println(f1.getAsInt());
        System.err.println(f2.getAsInt());

    }
}
