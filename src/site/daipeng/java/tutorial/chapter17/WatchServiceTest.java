package site.daipeng.java.tutorial.chapter17;

import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 11:47 下午
 **/
public class WatchServiceTest {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("/Users/daipeng");
        WatchService watcher = FileSystems.getDefault().newWatchService();
        path.register(watcher, ENTRY_CREATE);
        WatchKey key = watcher.take();
        for (WatchEvent<?> pollEvent : key.pollEvents()) {
            System.err.println(pollEvent.context() + " " + pollEvent.count() + " " + pollEvent.kind());
            System.exit(0);
        }

    }
}
