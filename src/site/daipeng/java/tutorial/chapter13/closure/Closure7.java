package site.daipeng.java.tutorial.chapter13.closure;

import java.util.function.IntSupplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 4:40 下午
 **/
public class Closure7 {
    int number = 0;
    IntSupplier t = () -> number++;

    IntSupplier makeFun(int x) {
        Integer i = 0;
//        i = i + 1;
        return () ->{
            int k = 0;
            k++;

            return 1 + k;
        } ;
    }
}
