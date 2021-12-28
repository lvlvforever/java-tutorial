package site.daipeng.java.tutorial.chapter13;

import java.util.function.Function;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 5:44 下午
 **/
public class FunctionComposition {

    public static void main(String[] args) {
        Function<String, String> f1 = (s) -> s.toLowerCase();
        Function<String, String> f2 = (s) -> s.replaceAll("B","I");
        Function<String, String> f3 = (s) -> s + " nice";
        Function<String, String> f4 = f1.compose(f2).andThen(f3);

        System.err.println(f4.apply("TODAY BS VERY"));
    }
}
