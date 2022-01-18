package site.daipeng.java.tutorial.chapter24;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 10:46 下午
 **/
public class ParallelPuzzle {
    static class IntGenerator
            implements Supplier<Integer> {
        private int current = 0;

        @Override
        public Integer get() {
            return current++;
        }
    }

    public static void main(String[] args) {
        List<Integer> x = Stream.generate(new IntGenerator())
                .limit(10)
                .parallel()  // [1]
                .collect(Collectors.toList());
        System.out.println(x);
    }
}
