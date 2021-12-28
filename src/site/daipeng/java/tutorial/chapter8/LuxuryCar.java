package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/27 10:05 下午
 **/
public class LuxuryCar {

    private Tire tire = new Tire();//定义时就初始化

    {
        this.tire = new Tire();//使用实例初始化方法
    }

    public LuxuryCar(Tire tire) {
        this.tire = tire;//在构造函数中初始化
    }

    public Tire getTire() { //延迟初始化，延迟到使用那一刻进行初始化，这种一般会配合单例使用
        if (this.tire == null) {
            this.tire = new Tire();
        }
        return tire;
    }

}
