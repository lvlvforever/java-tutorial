package site.daipeng.java.tutorial.chapter10;

import java.util.Locale;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 7:54 下午
 **/
public interface Animal {

    Object process(Object input);

    static void apply(Animal animal, Object s) {
        System.err.println(animal.process(s));
    }

     static void main(String[] args) {
        apply(new Rabbit(), "process");
    }
}

class Rabbit implements Animal {

    @Override
    public String process(Object input) {
        return "兔子 " + input;
    }
}

class Car implements Animal {
    @Override
    public Object process(Object input) {
        return "汽车 " + input;
    }
}

class Car2 {
    public Object process(Object input) {
        return "汽车 " + input;
    }
}

class Car2Adapter implements Animal {

    Car2 car2;

    public Car2Adapter(Car2 car2) {
        this.car2 = car2;
    }

    @Override
    public Object process(Object input) {
        return car2.process(input);
    }

}