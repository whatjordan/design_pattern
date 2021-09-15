package structural.flyweight;

import java.util.HashMap;

public class MapMarkerFactory {

    private HashMap<MapMakerType, MapMarker> mapMakerMap;

    private MapMarkerFactory() {
        this.mapMakerMap = new HashMap<>();
        mapMakerMap.put(MapMakerType.HOME, new HomeMapMarker());
        mapMakerMap.put(MapMakerType.COMPANY, new CompanyMapMarker());
    }

    private static class InnerStaticClass {
        private static final MapMarkerFactory INSTANCE = new MapMarkerFactory();
    }

    public static MapMarkerFactory getInstance() {
        return InnerStaticClass.INSTANCE;
    }

    public MapMarker getMapMarker(MapMakerType type) {
        return mapMakerMap.get(type);
    }

    public enum MapMakerType {
        HOME, COMPANY
    }
}
