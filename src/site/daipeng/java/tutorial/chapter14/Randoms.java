package site.daipeng.java.tutorial.chapter14;

import java.util.*;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 2:44 下午
 **/
public class Randoms {

    public static void main(String[] args) {
        Random random = new Random(42);
        Set<Integer> rand = new LinkedHashSet<>();
        for (int i = 0; i < 50; i++) {
            rand.add(random.nextInt(20));
        }
        System.err.println(rand);
        random = new Random(42);
        System.err.println(Arrays.toString(random.ints(5, 20).distinct().limit(7).sorted().toArray()));
        random = new Random(42);
        System.err.println(Arrays.toString(random.ints(5, 20).distinct().limit(7).sorted().toArray()));

         random = new Random(42);
        Set<Integer> data = new TreeSet<>();
        while (data.size() < 7) {
            int r = random.nextInt(20);
            if (r < 5) {
                continue;
            }
            data.add(r);
        }
        System.err.println(data);


        random = new Random(42);
        Set<Integer> data2 = new TreeSet<>();
        while (data2.size() < 7) {
            int r = random.nextInt(20);
            if (r < 5) {
                continue;
            }
            data2.add(r);
        }
        System.err.println(data2);
    }
}
