package site.daipeng.java.tutorial.chapter22;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 4:20 下午
 **/
interface Readable{
    void read();
}

enum Color implements Readable{
    RED{
        @Override
        void test() {}

        @Override
        public void read() {}
    }, GREEN{
        @Override
        void test() {}
        @Override
        public void read() {}
    };
    abstract void test();
}
interface Command{
    void action();
}
public class EnumTest {
    public static void main(String[] args) {

        EnumMap<Color, Command> commandMap = new EnumMap<>(Color.class);
        commandMap.put(Color.RED, () -> System.err.println("我是红色"));
        commandMap.put(Color.GREEN,() -> System.err.println("我是绿色"));





        for (Color color : Color.values()) {
            System.err.println("name: "+color.name());
            System.err.println("ordinal: "+color.ordinal());
            System.err.println("toString: " + color.toString());
        }
        Color color = Color.RED;
        switch (color) {
            case RED:
                System.err.println("red");
                break;
            case GREEN:
                System.err.println("green");
                break;
        }

        EnumSet<Color> colors = EnumSet.allOf(Color.class);
        System.err.println(colors);
        EnumSet<Color> gr = EnumSet.of(Color.GREEN, Color.RED,Color.RED);
        System.err.println(gr);
        gr.remove(Color.RED);
        System.err.println(gr);
        EnumSet<Color> other = EnumSet.complementOf(gr);
        System.err.println(other);

    }
}
