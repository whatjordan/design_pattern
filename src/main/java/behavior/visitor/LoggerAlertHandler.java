package behavior.visitor;

public class LoggerAlertHandler implements AlertHandler{
    @Override
    public void handle(TrafficAlert trafficAlert) {
        System.out.println("logger record traffic: " + trafficAlert.getTraffic());
    }

    @Override
    public void handle(SystemUsageAlert systemUsageAlert) {
        System.out.println("logger record system usage: " + systemUsageAlert.getUsage());
    }
}
