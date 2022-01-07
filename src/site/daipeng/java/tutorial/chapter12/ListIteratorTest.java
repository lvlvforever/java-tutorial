package site.daipeng.java.tutorial.chapter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 1:28 上午
 **/
public class ListIteratorTest {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.err.println(iterator.next());
            iterator.remove();
        }
    }

}
