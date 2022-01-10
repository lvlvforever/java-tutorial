package site.daipeng.java.tutorial.chapter14;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 6:05 下午
 **/
public class StreamBuilder {

    public static void main(String[] args) {
//        Stream.Builder<Integer> builder = Stream.builder();
//        for (int i = 0; i < 3; i++) {
//            builder.add(i);
//        }
//        builder.build().forEach(System.err::println);

//        int[] data = new int[]{1, 2, 3};
//        Arrays.stream(data).forEach(System.err::println);

        String data = "1,2,3";
        Pattern.compile("[.,]+").splitAsStream(data).forEach(System.err::println);

    }

}
