package site.daipeng.java.tutorial.chapter20;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/13 10:00 上午
 **/
interface IHasF{
    void f();
}

class HasF implements IHasF{
    @Override
    public void f() {
        System.out.println("HasF.f()");
    }
}
class Manipulator<T extends IHasF>{
    T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}



public class GenericEraseTest {

    public static void main(String[] args) {

        HasF hf = new HasF();
        Manipulator<IHasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();
//
//        Class c1 = new ArrayList<String>().getClass();
//        Class c2 = new ArrayList<Integer>().getClass();
//        System.err.println(c1 == c2);
//        System.err.println(Arrays.toString(c1.getTypeParameters()));
//        System.err.println(Arrays.toString(c2.getTypeParameters()));

    }

}
