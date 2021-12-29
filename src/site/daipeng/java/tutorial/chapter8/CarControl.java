package site.daipeng.java.tutorial.chapter8;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/28 6:58 下午
 **/
public class CarControl {

    void turnLeft() {}
    void turnRight() {}

}
class GoodCar {


    private final CarControl carControl = new CarControl();

    public static void main(String[] args) {
        GoodCar car = new GoodCar();
        car.carControl.turnLeft();
    }
}
