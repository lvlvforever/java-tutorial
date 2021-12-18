package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/17 12:34 上午
 **/
class This{
    void two(int i,int j) {
        System.err.println("two");
    }
    void three(int i,int j,int z){
        System.err.println("three");
    }
}

interface TwoArgs{
    void call2(This athis, int i, int j);
}

interface ThreeArgs{
    void call3(This athis, int i, int j,int z);
}

public class MultiUnbound {

    public static void main(String[] args) {
        TwoArgs twoArgs = This::two;
        ThreeArgs threeArgs = This::three;
        This athis = new This();
        twoArgs.call2(athis, 1, 2);
        threeArgs.call3(athis, 2, 3, 4);

    }
}
