package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/27 10:18 下午
 **/

public class Shape {

    public String shapeName;
    String description;
    protected String name;
    private String content;

    public Shape(String name) {
        this.name = name;
    }

    public void sayName() {
        System.err.println("i am shape");
    }

}

class Circle extends Shape{

    public Circle(String name) {
        super(name);
        this.shapeName = "shapeName";
        this.description = "同一个包内可以继承";
        this.name = "i am circle";
//        this.content
    }

    @Override
    public void sayName() {
        System.err.println("i am circle");
    }
}

class Rectangle extends Shape{

    public Rectangle(String name) {
        super(name);
        this.name = "i am rectangle";
    }

    @Override
    public void sayName() {
        super.sayName();
        System.err.println("i am rectangle");
    }
}
