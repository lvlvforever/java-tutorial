package site.daipeng.java.tutorial.chapter25;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 4:47 下午
 **/
public abstract class LifeRoutine {

    abstract void wash();

    abstract void eat();

    void startADay() {
        wash();
        eat();
        System.err.println("多么美好的一天呀");
    }

    public static void main(String[] args) {
        Mingming mingming = new Mingming();
//        mingming.startADay();
        Chengcheng chengcheng = new Chengcheng();
//        chengcheng.startADay();

        Proxy proxy = new Proxy(mingming);
        proxy.startADay();
        proxy.child = chengcheng;
        proxy.startADay();

    }
}
class Proxy{
    LifeRoutine child ;

    public Proxy(LifeRoutine child) {
        this.child = child;
    }

    void startADay(){
        child.startADay();
    }
}

class Mingming extends LifeRoutine{
    @Override
    void wash() {
        System.err.println("哥哥洗脸刷牙");
    }

    @Override
    void eat() {
        System.err.println("哥哥吃饭");
    }
}
class Chengcheng extends LifeRoutine{
    @Override
    void wash() {
        System.err.println("弟弟洗脸刷牙");

    }

    @Override
    void eat() {
        System.err.println("弟弟吃饭");

    }
}
