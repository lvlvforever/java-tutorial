package site.daipeng.java.tutorial.chapter25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 6:03 下午
 **/
interface Housework{
    void doHousework();

    boolean willDo(String name);

}

class Ming2 implements Housework {
    @Override
    public void doHousework() {
        System.err.println("哥哥在扫地");
    }

    @Override
    public boolean willDo(String name) {
        if (name.equals("扫地")) {
            return true;
        }
        System.err.println("哥哥只想扫地，不想"+name);
        return false;
    }
}
class Cheng2 implements Housework {
    @Override
    public void doHousework() {
        System.err.println("弟弟在刷碗");
    }

    @Override
    public boolean willDo(String name) {
        if (name.equals("刷碗")) {
            return true;
        }
        System.err.println("弟弟只想刷碗，不想"+name);
        return false;
    }
}
public class ChainTest {

    public static void main(String[] args) {
        List<Housework> users = Arrays.asList(new Ming2(), new Cheng2());
        List<String> houseworkNames = Arrays.asList("扫地", "刷碗");
        for (String houseworkName : houseworkNames) {
            for (Housework user : users) {
                if (user.willDo(houseworkName)) {
                    user.doHousework();
                }
            }
        }
    }


}
