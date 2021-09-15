package behavior.visitor;

public class TrafficAlert implements Alert {
    private String traffic;

    public TrafficAlert(String traffic) {
        this.traffic = traffic;
    }

    public String getTraffic() {
        return traffic;
    }

    @Override
    public void submit(AlertHandler alertHandler) {
        alertHandler.handle(this);
    }
}
