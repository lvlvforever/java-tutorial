package site.daipeng.java.tutorial.chapter13;

import java.util.Locale;
import java.util.function.Function;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:47 下午
 **/
@FunctionalInterface
interface FuncSS extends Function<String,String>{

}
public class ProduceFunction {

    static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.err.println(f.apply("HELLO,WORLD"));

        Function<String,String> test = s -> s.toLowerCase();

    }
}
