package structural.bridge;

public class LinuxPainter implements Painter {
    @Override
    public void paint(Object matrix) {
        // resolve matrix
        System.out.println("resolve the matrix by Linux");
    }
}
