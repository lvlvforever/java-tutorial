package site.daipeng.java.tutorial.chapter10;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 9:45 下午
 **/
public class RandomInt implements Readable{
    private Random random = new Random();
    private int count;

    public RandomInt(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;//标志结束了
        }
        cb.append("a");
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomInt(10));
        while (scanner.hasNext()) {
            System.err.println(scanner.next());
        }
    }
}
