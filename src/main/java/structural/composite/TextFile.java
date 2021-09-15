package structural.composite;

public class TextFile extends AbstractFile {

    public TextFile(String name) {
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
        System.out.println(getTab() + "scan text: " + name);
    }
}
