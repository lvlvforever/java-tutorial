package site.daipeng.java.tutorial.chapter18;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 11:31 上午
 **/
public class StringTest {
    public static void main(String[] args) {
        StringTest test = new StringTest();
        System.err.println(test);
        String s = String.format("Test:%s%d", 1, 2);
        System.err.println(s);
    }
    @Override
    public String toString() {
        return super.toString() + "";
    }
}
