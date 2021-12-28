package site.daipeng.java.tutorial.chapter6;

import java.util.Arrays;
import java.util.Random;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/18 9:05 下午
 **/

class Rock {
    int i;

    {
        System.err.println("i=" + i);
    }

    Rock() { // 这是一个构造器
        i = 10;
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(a));
    }
}


