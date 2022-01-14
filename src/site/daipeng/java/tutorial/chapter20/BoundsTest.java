package site.daipeng.java.tutorial.chapter20;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 12:29 上午
 **/
class Holder2<T>{
    T item;

    public Holder2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

interface HasColor2{
    String getColor();
}

class WithColor2<T extends HasColor2> extends Holder2<T>{
    public WithColor2(T item) {
        super(item);
    }
    public String getColor(){
        return item.getColor();
    }
}
class Coord2{
    public int x,y, z;
}

class WithColorCoord2<T extends Coord2 & HasColor2> extends WithColor2<T> {

    public WithColorCoord2(T item) {
        super(item);
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

public class BoundsTest extends Coord2 implements HasColor2 {
    @Override
    public String getColor() {
        return null;
    }

    public static void main(String[] args) {
        WithColorCoord2<BoundsTest> obj = new WithColorCoord2<>(new BoundsTest());
        obj.getColor();
        obj.getY();
    }

}
