package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/29 12:14 上午
 **/
public class Insect {
    private int i = 9;
    protected int j;
    private int yy = printInit("yy");
    Insect() {
        System.out.println("i = " + i + ", j = " + j + " y " + yy);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
