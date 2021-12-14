package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/13 11:32 下午
 **/
public class PlayGame implements SpendWeekend {
    @Override
    public String spend(String msg) {
        return "我玩了一整天的游戏，" + msg;
    }

}
