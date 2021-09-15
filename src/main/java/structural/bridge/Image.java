package structural.bridge;

public abstract class Image {
    protected Painter painter;
    private String filePath;

    public Image(Painter painter, String filePath) {
        this.painter = painter;
        this.filePath = filePath;
    }

    /**
     *
     * @param file
     * @return Object represent Matrix
     */
    public abstract Object parseFile(String file);

    public void display(){
        painter.paint(parseFile(filePath));
    };

    public void setPainter(Painter painter) {
        this.painter = painter;
    }
}
