package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 5:38 下午
 **/

class WithInner{
    class Inner{}
}

public class InheritInner extends WithInner.Inner{
    public InheritInner(WithInner wi) {
        wi.super();
    }
}
