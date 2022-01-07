package site.daipeng.java.tutorial.chapter12;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 8:45 下午
 **/
public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()) {
            System.err.println(stack.pop() + " ");
        }
    }
}
