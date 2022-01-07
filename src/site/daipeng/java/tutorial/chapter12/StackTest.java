package site.daipeng.java.tutorial.chapter12;

import java.util.Deque;
import java.util.Stack;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 8:35 下午
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        while (!stack.isEmpty()) {
            System.err.println(stack.pop());
        }
    }
}
