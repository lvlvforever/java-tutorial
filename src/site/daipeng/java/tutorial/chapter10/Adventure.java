package site.daipeng.java.tutorial.chapter10;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 9:23 下午
 **/
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // 认为h是CanFight类型
        u(h); //认为h是CanSwim类型
        v(h); // 认为h是CanFly类型
        w(h); // 认为h是ActionCharacter类型
    }
}
