package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 5:50 下午
 **/
import java.util.function.*;
import java.util.stream.*;
public class PredicateComposition {
    static Predicate<String>
            p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
            p4 = p1.negate().and(p2).or(p3);
    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fongopuckey")
                .filter(p4)
                .forEach(System.out::println);
    }
}
