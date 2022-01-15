package site.daipeng.java.tutorial.chapter25;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 5:55 下午
 **/
public interface ChessStrategy {

    void startOfChess();

    public static void main(String[] args) {
        PlayChess chess = new PlayChess();
        String context = "第一轮哥哥出场";
        chess.strategy = new Ming();
        chess.startChess(context);

        context = "第一轮弟弟出场";
        chess.strategy = new Cheng();
        chess.startChess(context);
    }

}
class PlayChess {
    ChessStrategy strategy;
    String context;

    void startChess(String context) {
        System.err.println("输出context:" + context);
        strategy.startOfChess();
    }
}

class Ming implements ChessStrategy {
    @Override
    public void startOfChess() {
        System.err.println("当头炮，把马跳");
    }
}
class Cheng implements ChessStrategy {
    @Override
    public void startOfChess() {
        System.err.println("把马跳，当头炮");
    }
}
