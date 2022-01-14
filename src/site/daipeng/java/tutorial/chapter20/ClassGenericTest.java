package site.daipeng.java.tutorial.chapter20;

import java.util.function.Supplier;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/12 11:03 下午
 **/
class Holder<T>{
    public  T s;

}

public class ClassGenericTest {

    public static void main(String[] args) {
        Holder<Integer> holder = new Holder<>();
        holder.s = 10;

//        holder.s = "123";
    }

}
