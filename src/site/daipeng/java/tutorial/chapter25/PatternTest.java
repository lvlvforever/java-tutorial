package site.daipeng.java.tutorial.chapter25;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 4:05 下午
 **/
public class PatternTest {








    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("site.daipeng.java.tutorial.chapter25.SingletonTest");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor method : constructors) {
                System.err.println(method.getName());
                method.setAccessible(true);
            Object o = method.newInstance();
            System.err.println(o);
        }
    }

}
