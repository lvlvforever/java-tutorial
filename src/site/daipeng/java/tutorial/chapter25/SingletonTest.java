package site.daipeng.java.tutorial.chapter25;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 4:04 下午
 **/
interface ValuableResource{
    void test();
}

public class SingletonTest {

    private static class SingletonResource implements ValuableResource{
        @Override
        public void test() {

        }
    }

    private static class SingletonResourceHolder{
        private static final SingletonResource resouce = new SingletonResource();
    }

    public static ValuableResource getResource() {
        return SingletonResourceHolder.resouce;
    }

    public static void main(String[] args) {
        getResource().test();
    }
}
