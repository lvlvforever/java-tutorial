package site.daipeng.java.tutorial.chapter20;

import sun.net.www.protocol.file.FileURLConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 1:09 上午
 **/
class Fruit {
}

class Apple extends Fruit {
}

class Hongfushi extends Apple {
}

class Orange extends Fruit {
}

public class CovariantArrays {


    void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Hongfushi());
//        apples.add(new Object());


    }



    public static void main(String[] args) {






        List<Apple> alist = new ArrayList<>();
        alist.add(new Apple());
        List<? extends Fruit> flist = new ArrayList<>();
        flist = alist;
        for (Fruit fruit : flist) {
            System.err.println(fruit);
        }


//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
//        flist.add(null);
//        Fruit f = flist.get(0);

        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // 可以，实际上就是Apple
        fruit[1] = new Hongfushi(); // 也可以，Hongfushi是一类苹果
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException 运行时异常
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}