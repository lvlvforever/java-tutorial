package site.daipeng.java.tutorial.chapter15;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 12:24 上午
 **/
public class AutoCloseTest {

    public static void main(String[] args) {
        try (BigHouse bg = new BigHouse()) {
//            throw new RuntimeException("in try");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class BigHouse implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new RuntimeException("in bighouse close");
        }
    }

}
