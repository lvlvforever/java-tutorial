package site.daipeng.java.tutorial.chapter21;

import java.util.Arrays;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/12 9:19 上午
 **/
class BigHouse{

}
public class ArrayOption {
    public static void main(String[] args) {
        BigHouse[] houses = new BigHouse[]{
                new BigHouse()
        };

        int[] intArray = new int[2];
        Arrays.setAll(intArray, i -> intArray[i] + 1);
        System.err.println(Arrays.toString(intArray));

//        Arrays.fill(intArray, 10);

        int[] intArray2 = {1, 2, 3};
        System.err.println(intArray2.length);


        int[][] intArray3 = new int[10][4];
        System.err.println(Arrays.deepToString(intArray3));




    }

}
