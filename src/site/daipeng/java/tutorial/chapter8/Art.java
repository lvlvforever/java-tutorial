package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/28 4:40 下午
 **/
public class Art {

    public Art() {
        System.err.println("art 构造器");
    }

    public static void main(String[] args) {
        Drawing drawing = new Drawing(10);
    }
}

class Drawing extends Art {
    public Drawing(int i) {

    }
}