package site.daipeng.java.tutorial.chapter14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 6:44 下午
 **/
public class Intermediate {

    public static void main(String[] args) {
        Stream.of(1, 2, 3).peek(System.err::println).forEach(k -> System.err.println(k + 1));
        Stream.of(3,1,2).sorted().forEach(System.err::println);
        Stream.of(3,1,2).sorted(Comparator.reverseOrder()).forEach(System.err::println);
        Stream.of(1,2,2).distinct().forEach(System.err::println);
        Stream.of(1, 2, 3).filter(k -> k > 1).forEach(System.err::println);
        Stream.of(1, 2, 3).map(k -> k + 20).forEach(System.err::println);
        Stream.of("1", "2", "3").mapToInt(Integer::parseInt).forEach(System.err::println);

        List<List<Integer>> data = new ArrayList<>();
        List<Integer> sub1 = new ArrayList<>();
        sub1.add(1);
        sub1.add(2);
        List<Integer> sub2 = new ArrayList<>();
        sub2.add(3);
        sub2.add(4);
        data.add(sub1);
        data.add(sub2);
        data.stream().forEach(System.err::println);
        data.stream().flatMap(k -> k.stream()).forEach(System.err::println);

    }

}
