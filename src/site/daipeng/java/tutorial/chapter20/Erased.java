package site.daipeng.java.tutorial.chapter20;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/13 11:27 上午
 **/
public class Erased<T> {

    private final int SIZE = 100;
    public void f(Object arg) {
//        // error: illegal generic type for instanceof
//        if (arg instanceof T) {
//        }
//        // error: unexpected type
//        T var = new T();
//        // error: generic array creation
//        T[] array = new T[SIZE];
//        // warning: [unchecked] unchecked cast
//        T[] array = (T[]) new Object[SIZE];
    }

}
