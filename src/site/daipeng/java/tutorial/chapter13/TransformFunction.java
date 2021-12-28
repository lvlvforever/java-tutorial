package site.daipeng.java.tutorial.chapter13;

import java.util.function.Function;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:55 下午
 **/
class Wood{
    @Override
    public String toString() {
        return "木头";
    }
}
class Middle{
    @Override
    public String toString() {
        return "中间材料";
    }
}
class Chopsticks{
    @Override
    public String toString() {
        return "筷子";
    }
}

public class TransformFunction {

    static Function<Wood,Chopsticks> transform(Function<Wood,Middle> func){
        return func.andThen(middle -> {
            System.err.println(middle);
            return new Chopsticks();
        });
    }

    public static void main(String[] args) {
        Function<Wood, Chopsticks> func = transform((wood) -> {
            System.err.println(wood);
            return new Middle();
        });
        Wood wood = new Wood();
        Chopsticks chopsticks = func.apply(wood);
        System.err.println(chopsticks);

    }
}
