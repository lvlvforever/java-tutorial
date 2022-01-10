package site.daipeng.java.tutorial.chapter14;

import java.util.*;
import java.util.function.Supplier;
import java.util.logging.Handler;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 4:45 下午
 **/
public class CreateStream {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4).forEach(System.err::print);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.err.println("");
        list.stream().forEach(System.err::print);
        System.err.println("");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.entrySet().stream().map(e -> e.getKey() + "" + e.getValue()).forEach(System.err::print);

        new Random().ints().boxed();
        new Random().ints(2,10).boxed();
        new Random().longs().boxed();
        new Random().doubles().boxed();
        new Random().doubles().boxed();

        for (int i : IntStream.range(0, 10).toArray()) {
            System.err.println(i);
        }


        Stream.generate(() -> "123").limit(3).forEach(System.err::println);

        Stream.generate(new IntegerSupplier()).limit(3).forEach(System.err::println);




    }


}
class IntegerSupplier implements Supplier<Integer>{
    private Random random = new Random(42);

    @Override
    public Integer get() {
        return random.nextInt(10);
    }
}
