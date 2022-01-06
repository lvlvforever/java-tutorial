package site.daipeng.java.tutorial.javapuzzle;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 2:58 下午
 **/
public class SordidSort {

    public static void main(String[] args) {
        System.err.println(Integer.MAX_VALUE);

        Integer big = new Integer(2000000000);
        Integer small = new Integer(-2000000000);
        Integer zero = new Integer(0);
        Integer[] a = new Integer[]{big,small, zero};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
//        System.err.println(Arrays.asList(a));

//        Arrays.sort(a,new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
////                System.err.println(second);
////                System.err.println(first);
//                return ((Integer) o2).intValue() -  ((Integer) o1).intValue();
//            }
//        });

        System.err.println(Arrays.asList(a));


    }

}
