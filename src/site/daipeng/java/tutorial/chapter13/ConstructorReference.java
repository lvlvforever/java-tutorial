package site.daipeng.java.tutorial.chapter13;

import java.util.function.IntFunction;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/17 12:41 上午
 **/
class Dog{
    String name;
    int age = 0;
    Dog(){
        name = "狗狗";
    }
    Dog(String name){
        this.name = name;
    }

    Dog(String name, int age) {
        this(name);
        this.age = age;
    }
}

interface MakeNoArgs{
    Dog make();
}
interface Make1Args{
    Dog make(String name);
}
interface Make2Args{
    Dog make(String name, int age);
}

public class ConstructorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;
        Make1Args m1a = Dog::new;
        Make2Args m2a = Dog::new;

        Dog d0 = mna.make();
        Dog d1 = m1a.make("狗狗");
        Dog d2 = m2a.make("狗狗", 10);

    }

}
