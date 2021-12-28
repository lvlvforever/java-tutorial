package site.daipeng.java.tutorial.chapter13;

import java.util.function.Function;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 5:57 下午
 **/
public class CurryingAndPartials {

    static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        Function<String, String> middle = sum.apply("Hi ");

        System.err.println(uncurried("Hi ", "Ho"));
        System.err.println(middle.apply("Ho"));
    }
}
