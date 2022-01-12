package site.daipeng.java.tutorial.chapter19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 11:25 下午
 **/

class Shape{

    public Shape() {

    }

    public void sayName(){

    }


}
class Circle extends Shape{

}

class Square extends  Shape{

}

public class InstanceTest {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Shape shape = new Shape();
//        boolean instance = Shape.class.isInstance(circle);//true
//        boolean instance2 = Circle.class.isInstance(shape);//false

        System.err.println(Circle.class.isAssignableFrom(Shape.class));
        System.err.println(Shape.class.isAssignableFrom(Circle.class));
        System.err.println(Shape.class.isAssignableFrom(Shape.class));

        System.err.println((shape.getClass() == Circle.class) + "");
        System.err.println((shape.getClass() == Shape.class) + "");


        Class<?> c = Shape.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.err.println(method);
        }
        Constructor[] ctors = c.getConstructors();
        for (Constructor ctor : ctors) {
            System.err.println(ctor);
        }



    }

}
