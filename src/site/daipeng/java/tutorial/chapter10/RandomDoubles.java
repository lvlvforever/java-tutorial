package site.daipeng.java.tutorial.chapter10;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 9:53 下午
 **/
public class RandomDoubles {
    Random RAND = new Random(47);

    public double next() {
        return RAND.nextDouble();
    }
}

class AdaptedRandomDoubles implements Readable {
    private int count;
    private RandomDoubles randomDoubles;

    public AdaptedRandomDoubles(int count, RandomDoubles randomDoubles) {
        this.count = count;
        this.randomDoubles = randomDoubles;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(randomDoubles.next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7, new RandomDoubles()));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}