package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:51 下午
 **/

import java.util.function.*;

class One {
}

class Two {
}

public class ConsumeFunction {
    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}
