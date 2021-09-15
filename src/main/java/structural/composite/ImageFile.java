package structural.composite;

public class ImageFile extends AbstractFile {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        System.out.println(getTab() + "scan image: " + name);
    }
}
