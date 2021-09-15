package structural.flyweight;
//Extrinsic state
public class Coordinates {
    private String x;
    private String y;

    public Coordinates(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " x: " + x + ", y: " + y;
    }
}