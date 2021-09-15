package structural.flyweight;

public abstract class MapMarker {
    //Intrinsic state
    public abstract String getGraphic();

    public void display(Coordinates coordinates) {
        System.out.println("Show " + getGraphic() + " at" + coordinates);
    }

}
