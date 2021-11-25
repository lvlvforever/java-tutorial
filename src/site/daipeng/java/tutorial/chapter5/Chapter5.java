package site.daipeng.java.tutorial.chapter5;

import java.security.SecureRandom;

/**
 * @author daipeng01
 * @desc
 * @date 2021/11/25 8:47 下午
 **/
public class Chapter5 {


    public static void main(String[] args) {
//        int[] data = new int[]{1,2,3,4,5,6};
//        for (int number : data) {
//            System.out.println(number);
//        }
//
//
//        for(int i = 0; i < data.length; i++){
//            System.out.println(data[i]);
//        }

//        makeMoney:
//        while(true){
//            for (int i = 0; i < 10; i++) {
//                if(i == 5){
//                    continue makeMoney;
//                }
//                System.out.println(i);
//            }
//        }

        makeMoney:
        while(true){
            for (int i = 0; i < 10; i++) {
                if(i == 5){
                    break makeMoney;
                }
                System.out.println(i);
            }
        }
        System.err.println("over");


        int i = 10;
        switch (i) {
            case 1:
                System.err.println('a');
                break;
            case 2:
                System.err.println('b');
                break;
            case 10:
                System.err.println('c');
                break;
            default:
                System.err.println("error");
        }

        String color = "red";
        switch (color) {
            case "red":
                System.err.println("red");
                break;
            case "green":
                System.err.println("green");
                break;
            default:
                System.err.println("error");
        }



    }


}
