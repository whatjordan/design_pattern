package behavior.visitor;

public class EmailAlertHandler implements AlertHandler {
    @Override
    public void handle(TrafficAlert trafficAlert) {
        if (trafficAlert.getTraffic().contains("timeout")) {
            System.out.println("send email! content: " + trafficAlert.getTraffic());
        }
    }

    @Override
    public void handle(SystemUsageAlert systemUsageAlert) {
        if (systemUsageAlert.getUsage() > 80) {
            System.out.println("send email! critical system usage: " + systemUsageAlert.getUsage());
        }
    }
}
