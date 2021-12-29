package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/28 11:54 下午
 **/
public class FinalTest {

    public final int size;
    public final Apple apple = new Apple();

    public FinalTest() {
        size = 10;
    }

    public void change() {
//        apple = new Apple(); 无法编译
    }

    public void change(final int size, final Apple apple) {
//        size = 20;
//        apple = new Apple();
    }


}
class Apple{
    String name;
}
