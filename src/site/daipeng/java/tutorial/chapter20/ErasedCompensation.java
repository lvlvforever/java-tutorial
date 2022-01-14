package site.daipeng.java.tutorial.chapter20;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/13 11:30 上午
 **/
class Building {
}
class House extends Building {
}
public class ErasedCompensation<T> {

    private Class<T> clazz;

    public ErasedCompensation(Class<T> clazz) {
        this.clazz = clazz;
    }

    public boolean f(Object arg) {
        return clazz.isInstance(arg);//arg是不是clazz的同类或者派生类
    }

    public static void main(String[] args) {
        ErasedCompensation<Building> t1 = new ErasedCompensation<>(Building.class);
        ErasedCompensation<House> t2 = new ErasedCompensation<>(House.class);
        System.err.println(t1.f(new Building()));
        System.err.println(t1.f(new House()));
        System.err.println(t2.f(new Building()));
        System.err.println(t2.f(new House()));
    }
}
