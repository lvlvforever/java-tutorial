package site.daipeng.java.tutorial.chapter20;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/13 11:10 上午
 **/

class GenericBase<T> {
    private T element;
    public void set(T arg) {
        element = arg;
    }
    public T get() {
        return element;
    }
}
class Derived1<T> extends GenericBase<T> { }
class Derived2 extends GenericBase { //提示Raw use of parameterized class 'GenericBase'
}

//class Derived3 extends GenericBase<?> { }//

public class GenericBaseTest {

    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); //Unchecked call to 'set(T)' as a member of raw type 'GenericBase'
    }

}
