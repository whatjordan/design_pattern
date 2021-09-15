package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class AlertList implements Alert {
    private List<Alert> alertList = new ArrayList<>();

    public void addAlert(Alert... alerts) {
        for (Alert alert : alerts) {
            alertList.add(alert);
        }

    }

    @Override
    public void submit(AlertHandler alertHandler) {
        for (Alert alert : alertList) {
            alert.submit(alertHandler);
        }
    }
}
