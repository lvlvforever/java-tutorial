package site.daipeng.java.tutorial.chapter9;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 9:51 下午
 **/
class Meal {
    private int i = 1;
    Meal() {
        System.err.println("in meal " + i);
        System.out.println("Meal()");
    }

    void saySth() {
        System.err.println("meal draw");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
