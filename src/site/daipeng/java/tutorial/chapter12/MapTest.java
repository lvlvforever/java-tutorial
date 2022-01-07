package site.daipeng.java.tutorial.chapter12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 9:01 下午
 **/
public class MapTest {

    public static void main(String[] args) {
        Map<Integer, String> data = new LinkedHashMap<>();
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
