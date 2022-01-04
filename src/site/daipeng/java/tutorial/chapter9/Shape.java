package site.daipeng.java.tutorial.chapter9;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 10:20 下午
 **/
public class Shape {

    void draw()
    {
        System.err.println("shape draw");
    }

    public Shape() {
        System.err.println("shape before draw");
        draw();
        System.err.println("shape after draw");
    }

    public Shape getRandomShape() {
        return new Shape();
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        if (shape instanceof Shape) {

        }
    }
}
class Circle extends Shape {
    private int radius = 1;

    public Circle() {
        System.err.println("circle constructor radius=" + radius);
    }

    @Override
    void draw() {
        System.err.println("circle draw radis=" + radius);
    }

    @Override
    public Circle getRandomShape() {
        return new Circle();
    }
}
