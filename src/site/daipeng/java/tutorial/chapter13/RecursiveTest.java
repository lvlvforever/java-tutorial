package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/15 11:32 下午
 **/
public class RecursiveTest {
    interface IntCall{
        int call(int arg);
    }
    static IntCall intCall = null;
    public static void main(String[] args) {
        intCall = n -> n == 0 ? 1 : n * intCall.call(n - 1);
        for (int i = 0; i < 10; i++) {
            System.err.println(intCall.call(i));
        }
    }
}
