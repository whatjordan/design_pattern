package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportPrototypeManager {
    private Map<String, ReportPrototype> reportPrototypeMap = new HashMap<>();
    private static ReportPrototypeManager reportPrototypeManager = new ReportPrototypeManager();

    private ReportPrototypeManager() {
    }

    private static class InnerStaticClass {
        private static final ReportPrototypeManager instance = new ReportPrototypeManager();
    }

    public void addPrototype(String key, ReportPrototype reportPrototype) {
        reportPrototypeMap.put(key, reportPrototype);
    }

    public ReportPrototype getReportPrototype(String key) {
        return reportPrototypeMap.get(key);
    }

    public static ReportPrototypeManager getReportPrototypeManager() {
        return InnerStaticClass.instance;
    }
}
