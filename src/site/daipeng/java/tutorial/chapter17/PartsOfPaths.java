package site.daipeng.java.tutorial.chapter17;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 11:05 下午
 **/
public class PartsOfPaths {

    public static void main(String[] args) {
        Path p = Paths.get("/Users", "daipeng", "jump.sh").toAbsolutePath();
        for(int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
        System.out.println("ends with '.sh': " + p.endsWith(".sh"));
        for(Path pp : p) {
            System.out.print(pp + ": ");
            System.out.print(p.startsWith(pp) + " : ");
            System.out.println(p.endsWith(pp));
        }

        System.out.println("Starts with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }
}
