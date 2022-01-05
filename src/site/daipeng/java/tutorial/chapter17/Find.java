package site.daipeng.java.tutorial.chapter17;

import java.nio.file.*;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 11:56 下午
 **/
public class Find {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/Users/daipeng");

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.{tmp,txt}");
        Files.walk(path).filter(matcher::matches).forEach(System.err::println);
        Files.walk(path).filter(Files::isRegularFile).forEach(System.err::println);

    }
}
