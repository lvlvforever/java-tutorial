package site.daipeng.java.tutorial.chapter17;

import java.nio.file.*;
import java.util.List;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 12:00 上午
 **/
public class ListOfLines {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("/Users", "daipeng", "jump.sh");
        Files.readAllLines(path)
                .forEach(System.err::println);
        List<String> lines = Files.readAllLines(path);
        Files.write(path, lines, StandardOpenOption.APPEND);
    }
}
