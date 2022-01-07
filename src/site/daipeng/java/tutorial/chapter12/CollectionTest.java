package site.daipeng.java.tutorial.chapter12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 6:24 下午
 **/
class Apple{
    public void sayName() {
        System.err.println("我是苹果");
    }
}
class Hongfushi extends Apple{

}
class Pear {
}

public class CollectionTest {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        System.err.println(collection);
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(2);
        System.err.println(collection2);

        collection.addAll(collection2);
        System.err.println(collection);

        collection.remove(1);
        System.err.println(collection);

        System.err.println(collection.containsAll(collection2));

        collection.removeIf(k -> k > 1);
        System.err.println(collection);














        List<Apple> raw = new ArrayList<>();
        raw.add(new Apple());
        raw.add(new Hongfushi());
        for (Apple apple : raw) {
            apple.sayName();
        }
    }
}
