package site.daipeng.java.tutorial.chapter14;

import jdk.nashorn.internal.runtime.options.Option;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/8 12:59 下午
 **/
public class OptionalTest {

    public static void main(String[] args) {
//        List<Integer> data = new ArrayList<>();
//        data.add(1);
//        data.add(2);
//        data.add(3);
//
//        Optional<Integer> maxOptional = data.stream().max(Comparator.naturalOrder());
//        if (maxOptional.isPresent()) {
//            System.err.println(maxOptional.get());
//        }
//
//
//
//        System.err.println(maxOptional);
//        Stream<Integer> stream = Stream.empty();
//        Optional<Integer> maxOptionalEmpty = stream.max(Comparator.naturalOrder());
//        System.err.println(maxOptionalEmpty);


        Optional<Object> empty = Optional.empty();
        Optional<Integer> notNull = Optional.of(3);
        Optional<Integer> nullable = Optional.ofNullable(null);

//        notNull.ifPresent(System.err::println);


        System.err.println(notNull.orElse(getDefaultValue()));
        System.err.println(nullable.orElse(getDefaultValue()));
        System.err.println(notNull.orElseGet(() -> {
            System.err.println("notnull OrElseGet执行了");
            int i = 10;
            return i + 120;
        }));
        System.err.println(nullable.orElseGet(() -> {
            System.err.println("nullable OrElseGet执行了");
            int i = 10;
            return i + 120;
        }));
    }

    private static Integer getDefaultValue() {
        System.err.println("getDefaultValue");
        return 10;
    }

}
