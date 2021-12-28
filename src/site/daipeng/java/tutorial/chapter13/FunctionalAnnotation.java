package site.daipeng.java.tutorial.chapter13;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 12:56 下午
 **/
@FunctionalInterface
interface Functional{
    String happy(String arg);
}

interface FunctionalNoAnn{
    String happy(String arg);
}

/**
 @FunctionalInterface
 interface NotFunctional{
     String happy(String arg);

     String hello();
 }
 产生错误信息
 Multiple non-overriding abstract methods found in interface

 */
public class FunctionalAnnotation {

    public String happy(String arg) {
        return arg + " is very happy";
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::happy;
        FunctionalNoAnn fna = fa::happy;
//        Functional fac = fa; //不兼容，因为FunctionalAnnotation并没有实现Functional接口
        Functional fl = name -> name + " is very very happy";
        FunctionalNoAnn fnal = name -> name + " is very very happy";


        Supplier<String> supplier = () -> "123";
        supplier.get();
        BooleanSupplier booleanSupplier = () -> Boolean.FALSE;
    }

}
