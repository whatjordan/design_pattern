package behavior.visitor;

public interface AlertHandler {
    void handle(TrafficAlert trafficAlert);
    void handle(SystemUsageAlert systemUsageAlert);
}
