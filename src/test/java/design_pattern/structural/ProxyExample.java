package design_pattern.structural;

import org.junit.Test;
import structural.flyweight.Coordinates;
import structural.flyweight.MapMarker;
import structural.flyweight.MapMarkerFactory;
import structural.proxy.AbstractRequest;
import structural.proxy.HttpRequestProxy;
import structural.proxy.RequestContext;

public class ProxyExample {
    @Test
    public void test() {
        AbstractRequest request = new HttpRequestProxy();
        request.doRequest(new RequestContext("GET: /path"));
    }

}
