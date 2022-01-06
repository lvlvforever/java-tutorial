package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 2:44 下午
 **/
public class NestedClass {

    private String score;

    public static class InnerStaticClass{
        private String name;

        public InnerStaticClass(String name) {
            this.name = name;
        }

        public void sayName() {
//            System.err.println(score);编译错误
            System.err.println(name);
        }
    }

    public static void main(String[] args) {
        InnerStaticClass innerStaticClass = new InnerStaticClass("嵌套类");
        innerStaticClass.sayName();
    }
}
