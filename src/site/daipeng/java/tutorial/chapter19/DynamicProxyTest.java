package site.daipeng.java.tutorial.chapter19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 11:54 下午
 **/
interface Readable{
    void readBook();
}
class Child implements Readable{

    @Override
    public void readBook() {
        System.err.println("孩子读书");
    }
}

class DynamicProxy implements InvocationHandler{
    private Object realObject;

    public DynamicProxy(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println(proxy.getClass() + " " + method + " " + args);
        return method.invoke(realObject, args);
    }
}
public class DynamicProxyTest {

    public static void main(String[] args) {
        Child child = new Child();
//        Parent parent = new Parent(child);
//        parent.readBook();

        Readable proxy = (Readable) Proxy.newProxyInstance(Readable.class.getClassLoader(),
                new Class[]{Readable.class},
                new DynamicProxy(child));
        proxy.readBook();
    }

}

class Parent implements Readable{
    private Child child;

    public Parent(Child child) {
        this.child = child;
    }

    @Override
    public void readBook() {
        System.err.println("家长让孩子读书");
        child.readBook();
        System.err.println("孩子读完了");
    }
}

