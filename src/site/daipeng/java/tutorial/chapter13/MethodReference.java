package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/15 11:48 下午
 **/
class LittleSheep{
    static void sheepMakeSound(String msg) {
        System.err.println("小羊:" + msg);
    }
}

class LittleDog{
    void dogMakeSound(String msg) {
        System.err.println("小狗:" + msg);
    }
}

class Go {
    static void go() {
        System.err.println("method reference");
    }
}

public class MethodReference {

    interface Soundable{
        void makeSound(String s);
    }



    public static void main(String[] args) {
        Soundable animal = LittleSheep::sheepMakeSound; //引用静态方法
        animal.makeSound("咩咩咩");

        LittleDog dog = new LittleDog();
        animal = dog::dogMakeSound;//引用实例方法
        animal.makeSound("汪汪汪");


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("匿名类");
            }
        }).start();

        new Thread(() -> System.err.println("lambda")).start();

        new Thread(Go::go).start();


    }
}
