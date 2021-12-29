package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/27 10:18 下午
 **/

public class Shape {

    public void sayName() {
        System.err.println("i am shape");
    }

    public void dispose() {
        System.err.println("销毁shape");
    }
}

class Circle extends Shape{

    public static void main(String[] args) {
        Circle circle = new Circle();
        try{
            circle.sayName();
        }catch(Exception e){

        }finally {
            circle.dispose();
        }
    }

    @Override
    public void dispose() {
        super.dispose();
        System.err.println("销毁circle");
    }
}

class Rectangle extends Shape{

    @Override
    public void sayName() {
        super.sayName();
        System.err.println("i am rectangle");
    }
}
