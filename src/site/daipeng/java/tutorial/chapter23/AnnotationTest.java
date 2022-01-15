package site.daipeng.java.tutorial.chapter23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 11:54 下午
 **/
public class AnnotationTest {


    //    @Test(value = "value", name = "name", score = 10)
    @Test("123")
    public void test() {
    }
    public static void main(String[] args) {
        Method[] declaredMethods = AnnotationTest.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Test test = method.getDeclaredAnnotation(Test.class);
            if (test != null) {
                System.err.println(test.name());
                System.err.println(test.value());
                System.err.println(test.score());
            }
        }
    }

}
