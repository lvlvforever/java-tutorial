package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/28 4:40 下午
 **/
public class Art {

    public void sayName() {
        System.err.println("我是基类-艺术");
    }

    public static void main(String[] args) {
        Art art = new Drawing();
        art.sayName();
    }
}
class Drawing extends Art {

    @Override
    public void sayName() {
        System.err.println("我是派生类-绘画");
    }
}