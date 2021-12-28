package site.daipeng.java.tutorial.chapter13;

import java.util.function.BiConsumer;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 3:16 下午
 **/
class In1 {}
class In2 {}


public class MethodConversion {
    static void accept(In1 i1, In2 i2) {
        System.out.println("accept()");
    }
    static void someOtherName(In1 i1, In2 i2) {
        System.out.println("someOtherName()");
    }
    public static void main(String[] args) {
        BiConsumer<In1,In2> bic;
        bic = MethodConversion::accept;
        bic.accept(new In1(), new In2());
        bic = MethodConversion::someOtherName; //只要参数和返回类型一致即可
        // bic.someOtherName(new In1(), new In2()); // 无法调用，必须使用BiConsumer里的accept方法
        bic.accept(new In1(), new In2());
    } }
