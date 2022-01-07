package site.daipeng.java.tutorial.chapter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 8:02 下午
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1, 2);
        System.err.println(arrayList);//[1, 2]


        System.err.println(arrayList.contains(2));//true
        arrayList.remove(0);//
        arrayList.remove(new Integer(1));
        System.err.println(arrayList);//[2]

        System.err.println(arrayList.indexOf(2));// 0

        List<Integer> subList = arrayList.subList(0, 1);
        System.err.println(subList);//[2]

        System.err.println(arrayList.get(0));//2

        arrayList.set(0, 3);
        System.err.println(arrayList);//[3]

        System.err.println(arrayList.isEmpty());//false
    }
}
