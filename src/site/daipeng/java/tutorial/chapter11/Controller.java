package site.daipeng.java.tutorial.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 5:00 下午
 **/
interface Event{
    boolean ready();

    void action();
}

public class Controller {
    private Random random = new Random();
    public class LightOn implements Event {
        @Override
        public boolean ready() {
            return random.nextBoolean();
        }

        @Override
        public void action() {
            System.err.println("开灯");
        }
    }
    public class LightOff implements Event {
        @Override
        public boolean ready() {
            return random.nextBoolean();
        }

        @Override
        public void action() {
            System.err.println("关灯");
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Event> eventList = new ArrayList() {{
            add(controller.new LightOn());
            add(controller.new LightOff());
        }};
        for (Event event : eventList) {
            if (event.ready()) {
                event.action();
            }
        }
    }
}
