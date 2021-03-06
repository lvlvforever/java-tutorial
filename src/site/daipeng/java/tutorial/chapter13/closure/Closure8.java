package site.daipeng.java.tutorial.chapter13.closure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 5:10 下午
 **/
public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 c7 = new Closure8();
        List<Integer> l1 = c7.makeFun().get();
        List<Integer> l2 = c7.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}
