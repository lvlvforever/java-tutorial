package site.daipeng.java.tutorial.chapter14;

import java.util.Optional;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/10 2:08 下午
 **/
public class OptionalOperation {

    public static void main(String[] args) {

        Optional<Integer> data = Optional.of(10);
        System.err.println(data.map(k -> k = k + 20));
        Optional<String> dataStr = data.flatMap(k -> Optional.of(k + ""));
        System.err.println(dataStr);

    }

}
