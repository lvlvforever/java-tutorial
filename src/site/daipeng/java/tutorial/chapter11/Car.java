package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 10:59 上午
 **/
public class Car {
    private String name = "benz";
    private class Engine{
//        private String name = "engine";
        //内部类
        public void sayName() {
            System.err.println(Car.this.name);
            System.err.println(name);
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = car.new Engine();
        engine.sayName();
    }
}
