package site.daipeng.java.tutorial.chapter6;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 11:30 下午
 **/
public class RichPerson {
    int house ;
    int money ;

    public RichPerson(int house) {
        this.house = house;
    }

    public RichPerson(int house, int money) {
        this(house);
        this.money = money;
    }
}
