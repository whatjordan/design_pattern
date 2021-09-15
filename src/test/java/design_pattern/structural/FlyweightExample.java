package design_pattern.structural;

import org.junit.Test;
import structural.decorator.*;
import structural.flyweight.Coordinates;
import structural.flyweight.MapMarker;
import structural.flyweight.MapMarkerFactory;

public class FlyweightExample {
    @Test
    public void test() {
        MapMarkerFactory factory = MapMarkerFactory.getInstance();
        MapMarker companyMark1 = factory.getMapMarker(MapMarkerFactory.MapMakerType.COMPANY);
        MapMarker companyMark2 = factory.getMapMarker(MapMarkerFactory.MapMakerType.COMPANY);
        System.out.println(companyMark1 == companyMark2);
        companyMark2.display(new Coordinates("100", "100"));
    }

}
