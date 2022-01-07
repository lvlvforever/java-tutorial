package site.daipeng.java.tutorial.chapter12;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 1:17 上午
 **/
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparing(k -> (Integer) k).reversed());
        queue.offer(1);
        queue.offer(3);
        queue.offer(4);
        queue.offer(2);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.err.println(iterator.next());
        }


        //        while (!queue.isEmpty()) {
//            System.err.println(queue.poll());
//        }


    }

}
