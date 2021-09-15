package design_pattern.structural;

import org.junit.Test;
import structural.bridge.*;

public class BridgeExample {
    @Test
    public void test(){
        Image gifImage = new GifImage(new WindowsPainter(), "/home/test1.gif");
        gifImage.display();
        Image jpgImage = new JpgImage(new LinuxPainter(), "/home/test2.jpg");
        jpgImage.display();
    }
}
