package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/14 8:56 上午
 **/
public class LambdaTest {

    interface Play {
        String playFootball();
    }

    interface Watch {
        String watchMovie(String whichMovie);
    }

    interface Travel {
        String travel(String from, String to);
    }

    public static void main(String[] args) {
        Play play = () -> "我踢了一天足球";
        Watch watch = whichMovie -> "我看了" + whichMovie + "这部电影";
        Travel travel = (from, to) -> "我从" + from + "去" + to;
        Play morePlay = () -> {
            System.err.println("我先踢了一天足球");
            return "我又踢了一天的足球";
        };
        System.err.println(play.playFootball());
        System.err.println(morePlay.playFootball());
        System.err.println(watch.watchMovie("冰雪长津湖"));
        System.err.println(travel.travel("北京","三亚"));

    }
}
