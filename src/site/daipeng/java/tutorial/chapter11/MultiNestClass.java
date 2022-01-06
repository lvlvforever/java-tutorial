package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 3:07 下午
 **/
public class MultiNestClass {

    private void f(){
        System.err.println("f");
    }

    class First{
        private void g(){
            System.err.println("g");
        }
        public class Second {
            void h(){
                System.err.println("h");
                g();
                f();
            }
        }
    }

    public static void main(String[] args) {
        MultiNestClass obj = new MultiNestClass();
        First first = obj.new First();
        First.Second second = first.new Second();
        second.h();
    }

}
