package site.daipeng.java.tutorial.chapter18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/11 2:14 下午
 **/
public class RegexTest {


    public static void main2(String[] args) {
        Pattern pattern = Pattern.compile("(hello)w");
        Matcher matcher = pattern.matcher("helloworld hellow ");
        int i = 1;
        while (matcher.find()) {
            System.err.println("第" + i + "次匹配");
            System.err.println(matcher.group());
            System.err.println(matcher.group(1));
            i++;
        }
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\w*?)(t*)");
        Matcher matcher = pattern.matcher("test1234t");
        if (matcher.matches()) {
            System.err.println("group1="+matcher.group(1));
            System.err.println("group2="+matcher.group(2));
        }
//        Pattern pattern = Pattern.compile("(\\d+?)(0*)");
//        Matcher matcher = pattern.matcher("1230000");
//        if (matcher.matches()) {
//            System.out.println("group1=" + matcher.group(1)); // "123"
//            System.out.println("group2=" + matcher.group(2)); // "0000"
//        }
    }



}
