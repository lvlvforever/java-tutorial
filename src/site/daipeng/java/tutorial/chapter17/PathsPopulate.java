package site.daipeng.java.tutorial.chapter17;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 11:20 下午
 **/
public class PathsPopulate {

    public static void main(String[] args) {
        Path path = Paths.get("/Users", "daipeng", "jump.sh");
        Path base = Paths.get("/");
        System.err.println(base.relativize(path));
        System.err.println(path.resolve("name"));
    }
}
