package site.daipeng.java.tutorial.chapter14;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/10 3:35 下午
 **/
public class TerminalOperation {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(2);
        data.add(2);
        data.add(3);


//
//        System.err.println(data.stream().count());
//        System.err.println(data.stream().max(Comparator.naturalOrder()));
//        System.err.println(data.stream().min(Comparator.naturalOrder()));

        OptionalDouble average = data.stream().mapToInt(k -> k).average();
        System.err.println(average);
        OptionalInt max = data.stream().mapToInt(k -> k).max();
        System.err.println(max);
        int sum = data.stream().mapToInt(k -> k).sum();
        System.err.println(sum);

        System.err.println(data.stream().findFirst());
        System.err.println(data.stream().findAny());


        System.err.println(data.stream().anyMatch(k -> k > 1));
        System.err.println(data.stream().allMatch(k -> k > 1));
        System.err.println(data.stream().noneMatch(k -> k > 1));


        Optional<Integer> reduceResult = data.stream().reduce((p1, p2) -> {
            System.err.println(p1);
            System.err.println(p2);
            return p1 + p2;
        });
        System.err.println(reduceResult);
        Integer reduceResult2 = data.stream().reduce(20,(p1, p2) -> {
            System.err.println(p1);
            System.err.println(p2);
            return p1 + p2;
        });
        System.err.println(reduceResult2);





        int[] result = data.stream().mapToInt(k -> k).toArray();
        long[] longs = data.stream().mapToLong(k -> k.longValue()).toArray();
        Object[] objects = data.stream().toArray();
        Integer[] result2 = data.stream().toArray(Integer[]::new);

        List<Car> carList = new ArrayList<>();
        Car[] cars = carList.stream().toArray(Car[]::new);


        data.stream().parallel().forEach(System.err::println);
//        List<String> asList = Arrays.stream(s).collect(Collectors.toList());

        String[] s = new String[]{"hello", "world","hello"};
//        Map<String, String> sMap = Arrays.stream(s).collect(Collectors.toMap(k -> k, k -> k));
//        System.err.println(sMap);
        System.err.println(Arrays.stream(s).collect(Collectors.toMap(k -> k, k -> k, (k, v) -> k + "duplicate")));










    }

    private class Car {

    }

}
