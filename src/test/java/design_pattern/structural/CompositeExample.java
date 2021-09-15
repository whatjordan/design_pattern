package design_pattern.structural;

import org.junit.Test;
import structural.composite.FolderFile;
import structural.composite.ImageFile;

public class CompositeExample {
    @Test
    public void test() {
        FolderFile folderFile = new FolderFile("test");
        folderFile.add(new ImageFile("test.jpg"));
        FolderFile tmp = folderFile;
        for (int i = 0; i < 5; i++) {
            FolderFile tmp1 = new FolderFile("tmp");
            tmp.add(tmp1);
            tmp = tmp1;
        }
        tmp.add(new ImageFile("img.jpg"));
        folderFile.scan();
    }

}
