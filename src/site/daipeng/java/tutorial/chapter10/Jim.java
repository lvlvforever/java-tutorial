package site.daipeng.java.tutorial.chapter10;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 7:34 下午
 **/
interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}
interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}
public class Jim implements Jim1, Jim2 {
    @Override
    public void jim() {
        Jim2.super.jim();//这里通过Jim2.super来调用Jim2里的jim方法
    }
    public static void main(String[] args) {
        new Jim().jim();
    } }
