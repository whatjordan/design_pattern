package behavior.visitor;

public class SystemUsageAlert implements Alert {
    private int usage;

    public SystemUsageAlert(int usage) {
        this.usage = usage;
    }

    @Override
    public void submit(AlertHandler alertHandler) {
        alertHandler.handle(this);
    }

    public int getUsage() {
        return usage;
    }
}
