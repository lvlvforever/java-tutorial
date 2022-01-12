package site.daipeng.java.tutorial.chapter19;

import java.util.Random;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 10:37 下午
 **/

class Initable1 {
    static final int WEIGHT = 10;
    static final int HEIGHT = new Random().nextInt(10);
    static {
        System.err.println("Initable1 初始化");
    }
}
class Initable2 {
    static  int WEIGHT = 10;
    static {
        System.err.println("Initable2 初始化");
    }
}
class Initable3 {
    static int WEIGHT = 10;
    static {
        System.err.println("Initable3 初始化");
    }
}
public class InitableTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable1 = Initable1.class;
        System.err.println("创建了Initable1的引用");
        System.err.println(Initable1.WEIGHT);
        System.err.println(Initable1.HEIGHT);
        System.err.println(Initable2.WEIGHT);
        Class initable3 = Class.forName("site.daipeng.java.tutorial.chapter19.Initable3");
        System.err.println("创建Initable3的引用");
        System.err.println(Initable3.WEIGHT);

        Class clazz = int.class;
        Class<Integer> genericClazz = int.class;
        genericClazz = Integer.class;
        clazz = double.class;
//        genericClazz = double.class;
//        clazz.isInstance()

    }
}
