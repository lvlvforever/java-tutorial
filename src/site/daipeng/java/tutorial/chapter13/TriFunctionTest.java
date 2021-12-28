package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:24 下午
 **/
@FunctionalInterface
interface TriFunction<T,U,V,R>{
    R apply(T t, U u, V v);
}

public class TriFunctionTest {

    Integer f(int i, long j, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunctionTest test = new TriFunctionTest();
        TriFunction<Integer, Long, Double, Integer> triFunction = test::f;
        System.err.println(triFunction.apply(1, 2L, 3.0));
        triFunction = (i, j, d) -> i;
    }

}
