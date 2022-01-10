package site.daipeng.java.tutorial.chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Handler;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/10 11:56 下午
 **/
public class FinallyTest {

    public static void main(String[] args) {
//        System.err.println(test());

        try{
            try {
                throw new RuntimeException("try");
            } catch (Exception e) {
                throw e;
            }finally {
                throw new RuntimeException("finally");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(new File("111"))) {

        } catch (Exception e) {

        }







    }

    public static BigHouse test(){
        BigHouse bh = new BigHouse();
        try {
            throw new RuntimeException("rrr");

        } catch (RuntimeException e) {
            System.err.println("runtime");
            bh.name = "catch";
            System.exit(0);
            return bh;

        }finally {
            System.err.println("finally");
            bh = new BigHouse();
            bh.name = "finally";
        }
    }

    public static class BigHouse{
        public String name;

        @Override
        public String toString() {
            return "bighouse:" + name;
        }
    }
}
