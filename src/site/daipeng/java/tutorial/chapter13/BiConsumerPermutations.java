package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:32 下午
 **/

import java.util.function.*;

public class BiConsumerPermutations {
    static BiConsumer<Integer, Double> bicid = (i, d) ->
            System.out.format("%d, %f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) ->
            System.out.format("%d, %f%n", i, d);
    static BiConsumer<Integer, Long> bicil = (i, l) ->
            System.out.format("%d, %d%n", i, l);

    public static void main(String[] args) {
        bicid.accept(47, 11.34);
        bicdi.accept(22.45, 92);
        bicil.accept(1, 11L);


        IntToDoubleFunction test = (i) -> i;
        Function<Integer, Double> fid = i -> Double.valueOf(i);
        IntToDoubleFunction fid2 = i -> i;
    }
}
