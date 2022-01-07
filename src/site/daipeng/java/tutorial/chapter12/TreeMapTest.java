package site.daipeng.java.tutorial.chapter12;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/7 1:02 上午
 **/
public class TreeMapTest {

    public static void main(String[] args) {
        Map<Integer, String> data = new TreeMap<>(Comparator.comparing(k -> (Integer) k).reversed());
        data.put(2, "美国");
        data.put(3, "俄罗斯");
        data.put(1, "中国");
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.err.println(key + " " + value);
        }
    }

}
