package site.daipeng.java.tutorial.chapter24;

import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 10:20 下午
 **/
public class ParallelTest {

    public static boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> primes = LongStream.iterate(2, i -> i + 1)
//                .parallel()
                .filter(ParallelTest::isPrime)
                .limit(100000)
                .mapToObj(Long::toString)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.err.println("耗时:" + (end - start));
    }

}
