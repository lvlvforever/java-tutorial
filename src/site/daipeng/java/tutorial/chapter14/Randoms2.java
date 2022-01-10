package site.daipeng.java.tutorial.chapter14;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 3:11 下午
 **/
public class Randoms2 {
    public static void main(String[] args) {
        new Random(42).ints(5, 20).distinct().limit(7).sorted().forEach(System.err::println);

        Random random = new Random(42);
        Set<Integer> data = new TreeSet<>();
        while (data.size() < 7) {
            int r = random.nextInt(20);
            if (r < 5) {
                continue;
            }
            data.add(r);
        }
        System.err.println(data);

    }
}
