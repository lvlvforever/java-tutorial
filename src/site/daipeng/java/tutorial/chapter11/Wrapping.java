package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 2:13 下午
 **/
public class Wrapping {
    int i;

    public Wrapping(int i) {
        this.i = i;
    }

    public void test(int i ) {
        Wrapping wrapping = new Wrapping(i){
            @Override
            public void test(int i) {
                System.err.println("匿名内部类构造函数");
            }
        };
    }

}

