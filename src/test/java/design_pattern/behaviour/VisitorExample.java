package design_pattern.behaviour;

import behavior.visitor.*;
import org.junit.Test;

public class VisitorExample {
    @Test
    public void test() {
        Alert trafficAlert1 = new TrafficAlert("normal traffic");
        Alert trafficAlert2 = new TrafficAlert("ping timeout!");
        Alert systemUsage1 = new SystemUsageAlert(30);
        Alert systemUsage2 = new SystemUsageAlert(90);
        AlertList alertList = new AlertList();
        alertList.addAlert(trafficAlert1, trafficAlert2, systemUsage1, systemUsage2);
        alertList.submit(new LoggerAlertHandler());
        alertList.submit(new EmailAlertHandler());
    }
}
