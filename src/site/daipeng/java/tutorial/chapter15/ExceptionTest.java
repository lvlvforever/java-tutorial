package site.daipeng.java.tutorial.chapter15;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/10 9:11 下午
 **/
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            test();

        }catch(Exception e){
            BizException bizException = new BizException(1,"123");
            bizException.initCause(e);
            throw bizException;
        }
    }
    private static void test()  {
        throw new NullPointerException();
    }
}
