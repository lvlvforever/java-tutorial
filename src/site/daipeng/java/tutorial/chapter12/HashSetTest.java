package site.daipeng.java.tutorial.chapter12;

import java.util.*;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 8:49 下午
 **/
public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> data = new TreeSet<>(Comparator.comparing(k -> (Integer)k).reversed());
        data.add(200);
        data.add(100);
        data.add(1);
        data.add(1);
        data.add(3);
        System.err.println(data);
    }
}
