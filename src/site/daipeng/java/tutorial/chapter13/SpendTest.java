package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/13 11:37 下午
 **/
public class SpendTest {

    public static void main(String[] args) {

        SpendWeekend[] methods = new SpendWeekend[4];

        methods[0] = new SpendWeekend() {
            @Override
            public String spend(String msg) {
                return "我逛了一整天的商场，" + msg;
            }
        };

        methods[1] = new PlayGame();

        methods[2] = WatchMovie::watchMovie;

        methods[3] = msg -> "我写了一整天的代码，" + msg;

        for (SpendWeekend method : methods) {
            String result = method.spend("多么美好的一天啊");
            System.err.println(result);
        }
    }

}
