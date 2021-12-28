package site.daipeng.java.tutorial.chapter13.closure;

import java.util.function.IntSupplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 4:40 下午
 **/
public class Closure4 {
    IntSupplier makeFun(int x) {
        int i = 0;
//        i++; //同样会报错
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }
}
