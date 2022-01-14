package site.daipeng.java.tutorial.chapter20;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/12 11:38 下午
 **/
class Counter{
    private static int count = 0;
    private final long id = count++;

    public <T> void f(T t){

    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "count: " + count;
    }
}

class BasicSupplier<T> implements Supplier<T>{
    private Class<T> clazz;

    public BasicSupplier(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T get() {
        try {
            return clazz.newInstance();
        } catch (InstantiationException |
                IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Supplier<T> create(Class<T> type){
        return new BasicSupplier<>(type);
    }
}

public class MethodGenericTest {
    public static void main(String[] args) {
        Stream.generate(BasicSupplier.create(Counter.class)).limit(10).forEach(System.err::println);
    }
}
