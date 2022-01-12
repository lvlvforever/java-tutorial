package site.daipeng.java.tutorial.chapter19;

import java.util.regex.Matcher;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/12 12:18 上午
 **/
interface BiggerHouse{
    void f();
}
class MyBigHouse implements BiggerHouse{
    @Override
    public void f() {}
    public void g(){}
}
public class InterfaceViolation {
    public static void main(String[] args) {
        BiggerHouse bh = new MyBigHouse();
        bh.f();
        if (bh instanceof MyBigHouse) {
            MyBigHouse mbh = (MyBigHouse) bh;
            mbh.g();
        }
    }
}
