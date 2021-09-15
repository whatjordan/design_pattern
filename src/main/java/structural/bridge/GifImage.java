package structural.bridge;

public class GifImage extends Image{
    public GifImage(Painter painter, String filePath) {
        super(painter, filePath);
    }

    @Override
    public Object parseFile(String file) {
        System.out.println("Parse the file to GIF format: " + file);
        return new Object();
    }
}
