package site.daipeng.java.tutorial.chapter9;

import java.util.Random;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/2 10:11 下午
 **/
public class MobilePhone {

    public int weight = 10;

    public void playMusic() {
        System.err.println("手机播放音乐");
    }

    public void saySth() {
        System.err.println("说点什么吧");
    }

    private void f() {
        System.err.println("in mobile phone f");
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        MobilePhone phone = new IPhone();
        System.err.println("基类调用，直接访问属性：" + phone.weight + " 调用方法:" + phone.getWeight());
        IPhone iPhone = new IPhone();
        System.err.println("派生类类调用，直接访问属性：" + iPhone.weight + " 调用方法:" + iPhone.getWeight());

    }

//    public static MobilePhone getRandom() {
//        Random random = new Random();
//        int i = random.nextInt(3);
//        switch (i) {
//            case 0:
//                return new IPhone();
//            case 1:
//                return new RealmePhone();
//            default:
//                return new XiaomiPhone();
//        }
//    }
}

class IPhone extends MobilePhone {
    public int weight = 20;
    @Override
    public void playMusic() {
        System.err.println("苹果手机播放音乐");
    }

    @Override
    public int getWeight() {
        int superWeight = super.getWeight();
        superWeight = super.weight;
        return weight;
    }
}

class RealmePhone extends MobilePhone {
    @Override
    public void playMusic() {
        System.err.println("realme手机播放音乐");
    }
}
class XiaomiPhone extends MobilePhone {

    @Override
    public void saySth() {
        System.err.println("雷军确实厉害");
    }

    @Override
    public void playMusic() {
        System.err.println("xiaomi手机播放音乐");
    }
}
