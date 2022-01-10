package site.daipeng.java.tutorial.chapter15;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/10 11:47 下午
 **/
public class BizException extends RuntimeException {

    private int code;
    private String msg;

    public BizException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BizException(String message, int code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }
}