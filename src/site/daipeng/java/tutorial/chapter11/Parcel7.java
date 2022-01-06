package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 12:28 下午
 **/
interface Content7{
    void sayName();
}
public class Parcel7 {

    class MyContent7 implements Content7 {
        @Override
        public void sayName() {
            System.err.println("我是匿名内部类");
        }
    }

    public Content7 content7(){
        return new MyContent7();
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        p.content7().sayName();
    }
}
