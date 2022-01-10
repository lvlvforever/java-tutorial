package site.daipeng.java.tutorial.chapter14;

import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 5:55 下午
 **/
public class Fibonacci {
    int x = 1;

    public Stream<Integer> numbers(){
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers().skip(20).limit(10).forEach(System.err::println);
    }

}
