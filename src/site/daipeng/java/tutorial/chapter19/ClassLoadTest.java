package site.daipeng.java.tutorial.chapter19;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 9:51 下午
 **/

class Car{
    static {
        System.err.println("loading car");
    }
}

class BigHouse{
    static {
        System.err.println("loading bighouse");
    }
}
class Bike{
    static {
        System.err.println("loading bike");
    }
}

public class ClassLoadTest {
    public static void main(String[] args) {
        System.err.println("inside main");
        new Car();
        try {
            Class.forName("site.daipeng.java.tutorial.chapter19.BigHouse");
        } catch (ClassNotFoundException e) {
            System.err.println("找不到需要加载的类时会抛出异常");
        }
        System.err.println("after class.forname(bighouse)");

        Class clazz = new BigHouse().getClass();
        System.err.println(clazz.getCanonicalName());
        System.err.println(clazz.getName());
        System.err.println(clazz.getSimpleName());
        System.err.println(clazz.isInterface());
        System.err.println(clazz.getSuperclass());
        try {
            BigHouse house =(BigHouse) clazz.newInstance();
            System.err.println("bighouse=" + house);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
