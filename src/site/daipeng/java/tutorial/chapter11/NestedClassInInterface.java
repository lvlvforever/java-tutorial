package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 3:02 下午
 **/
public interface NestedClassInInterface {

    void sayName();

    class Test implements NestedClassInInterface {
        @Override
        public void sayName() {
            System.err.println("接口中的嵌套类");
        }
    }

    static void main(String[] args) {
        new Test().sayName();
    }
}
