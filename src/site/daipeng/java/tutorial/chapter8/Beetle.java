package site.daipeng.java.tutorial.chapter8;


/**
 * @author daipeng01
 * @desc
 * @date 2021/12/29 12:14 上午
 **/
public class Beetle extends Insect{
    private int k = printInit("Beetle.k.initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Beetle  main");
        Beetle b = new Beetle();
    }
}
