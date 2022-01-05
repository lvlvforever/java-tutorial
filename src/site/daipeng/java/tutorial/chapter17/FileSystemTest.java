package site.daipeng.java.tutorial.chapter17;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/4 11:41 下午
 **/
public class FileSystemTest {
    static void show(String id, Object p) {
        System.out.println(id + ": " + p);
    }
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("os.name"));
        FileSystem fsys = FileSystems.getDefault();
        for(FileStore fs : fsys.getFileStores())
            show("File Store", fs);
        for(Path rd : fsys.getRootDirectories())
            show("Root Directory", rd);
        show("Separator", fsys.getSeparator());
        show("UserPrincipalLookupService",
                fsys.getUserPrincipalLookupService());
        show("isOpen", fsys.isOpen());
        show("isReadOnly", fsys.isReadOnly());
        show("FileSystemProvider", fsys.provider());
        show("File Attribute Views",
                fsys.supportedFileAttributeViews());
    }
}
