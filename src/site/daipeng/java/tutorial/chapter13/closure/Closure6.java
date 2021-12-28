package site.daipeng.java.tutorial.chapter13.closure;

import java.util.function.IntSupplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 4:40 下午
 **/
public class Closure6 {
    IntSupplier makeFun(int x) {
        int i = 0;
        final int xFinal = x++;
        final int iFinal = i++;
        return () -> xFinal + iFinal;
    }
}
