package site.daipeng.java.tutorial.chapter10;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 4:24 下午
 **/
public interface Flyable {

    String name = "FlyableInterface";

    void saySth();


    default void sayName() {
//        name = "23"; Cannot assign a value to final variable 'name'
        System.err.println("default sayName " + name);
    }

}

interface Swimmable{
    void swim();
}

class Bird implements Flyable {
    @Override
    public void saySth() {
        sayName();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.saySth();
    }
}
