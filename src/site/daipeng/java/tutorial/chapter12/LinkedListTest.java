package site.daipeng.java.tutorial.chapter12;

import java.util.LinkedList;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 8:25 下午
 **/
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        System.err.println(linkedList);// 1

        System.err.println(linkedList.getFirst()); //1
        System.err.println(linkedList.element());//1
        System.err.println(linkedList.peek());//1

        linkedList.addFirst(2);
        System.err.println(linkedList);//2,1

        linkedList.offer(3);
        linkedList.add(4);
        linkedList.addLast(5);
        System.err.println(linkedList);//2,1,3,4,5

        System.err.println(linkedList.remove());//2
        System.err.println(linkedList.removeFirst());//1
        System.err.println(linkedList.poll());//3
        System.err.println(linkedList.removeLast());//5
        System.err.println(linkedList);//4


    }

}
