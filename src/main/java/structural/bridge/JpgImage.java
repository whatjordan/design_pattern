package structural.bridge;

public class JpgImage extends Image {
    public JpgImage(Painter painter, String filePath) {
        super(painter, filePath);
    }

    @Override
    public Object parseFile(String file) {
        System.out.println("Parse the file to JPG format: " + file);
        return new Object();
    }
}
