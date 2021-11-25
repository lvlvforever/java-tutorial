package site.daipeng.java.tutorial.chapter4;

import java.util.Objects;

/**
 * @author daipeng01
 * @desc
 * @date 2021/11/24 7:15 下午
 **/
public class Chapter4 {
    private int amount;
    public static void main(String[] args) {
        Chapter4 chapter4 = new Chapter4();
        chapter4.amount = 10;
        Chapter4.increment(chapter4);
        System.err.println(chapter4.amount);

        compareInteger();

        int x = 1;
        int y = 2;
        int sum = x + y;
        short a = 10;
        short b = 20;


//        int x = 10;
//        chapter4.test(x);
//        System.err.println(x);

    }

    private static void increment(Chapter4 chapter4) {
        chapter4.amount++;
    }

    private void test(int x) {
        x = x + 1;
    }

    private static void compareInteger() {
        Integer x  = 10;
        Integer y = 10;
        System.err.println(x == y);

        Integer a  = 129;
        Integer b = 129;
        System.err.println(a == b);

    }

}
class House {
    int area;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return area == house.area;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}