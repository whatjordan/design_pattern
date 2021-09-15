package structural.composite;

public abstract class AbstractFile {
    protected String name;
    protected int depth;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract void scan();

    protected String getTab(){
        String tab = "";
        for (int i = 0; i < depth; i++) {
            tab += "\t";
        }
        return tab;
    }
}
