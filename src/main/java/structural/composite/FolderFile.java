package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderFile extends AbstractFile {

    List<AbstractFile> files = new ArrayList<>();

    public FolderFile(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public void scan() {
        System.out.println(getTab() + "scan folder: " + name);
        depth++;
        for (AbstractFile file : files) {
            file.depth = depth;
            file.scan();
        }
    }
}
