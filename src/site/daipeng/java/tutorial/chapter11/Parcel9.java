package site.daipeng.java.tutorial.chapter11;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 2:23 下午
 **/
interface  Content9{
     void readLable();
}
public class Parcel9 {

    public Content9 content9(String name) {
        return new Content9() {
            private String label = name;
            {
                System.err.println("此处可以执行实例初始化");
            }

            @Override
            public void readLable() {
                System.err.println(label);
            }
        };
    }

    public static void main(String[] args) {
        Content9 content9 = new Parcel9().content9("123");
        content9.readLable();
    }

}
