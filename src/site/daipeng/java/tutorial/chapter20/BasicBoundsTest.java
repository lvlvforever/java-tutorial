package site.daipeng.java.tutorial.chapter20;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/13 11:34 下午
 **/

interface HasColor{
    String getColor();
}
class WithColor<T extends HasColor>{
    T item;

    public WithColor(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String getColor() {
        return item.getColor();
    }

}
class Coord{
    public int x,y, z;
}

class WithColorCoord<T extends Coord & HasColor>{
    T item;

    public WithColorCoord(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String getColor() {
        return item.getColor();
    }
    int getX() {
        return item.x;
    }
    int getY() {
        return item.y;
    }
    int getZ() {
        return item.z;
    }
}

public class BasicBoundsTest extends Coord implements HasColor {
    @Override
    public String getColor() {
        return null;
    }

    public static void main(String[] args) {
        WithColorCoord<BasicBoundsTest> obj = new WithColorCoord<>(new BasicBoundsTest());
        obj.getColor();
        obj.getX();
    }
}
