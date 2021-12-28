package site.daipeng.java.tutorial.chapter6;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 9:05 下午
 **/

class Rock2 {
    Rock2(int i) { // 这是一个构造器
        System.out.print("Rock " + i);
    }
}

public class SimpleConstructor2 {


    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }
//    static void f(int i, String s11) {
//        System.out.println("int: " + i + ", String: " + s11);
//    }

    static void f1(int x) {
        System.out.print("f1(int)");
    }
    static void f2(long x) {
        System.out.print("f2(long)");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
        int i = 1;
        f1(i);
        f2(i);

    }
}
