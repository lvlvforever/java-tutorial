package site.daipeng.java.tutorial.chapter12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 1:07 上午
 **/
public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.err.println(queue);//[1, 2]
        System.err.println(queue.peek());//1
        System.err.println(queue.element());//1

        System.err.println(queue.poll());//1
        System.err.println(queue.remove());//2
        System.err.println(queue);//[]


    }

}
