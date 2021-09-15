package behavior.mediator;

import java.text.MessageFormat;
import java.util.*;

public class StatusBarMediator implements Mediator {

    private Map<String, String> userIdToNameMap = new HashMap<>();

    @Override
    public void addUser(String userId, String userName) {
        userIdToNameMap.put(userId, userName);
    }

    @Override
    public void removeUser(String userId) {
        userIdToNameMap.remove(userId);
    }

    @Override
    public void handleComponent(Component component) {
        String userName = userIdToNameMap.get(component.getUserId());
        if (userName == null) {
            throw new NoSuchElementException("not found user id: " + component.getUserId());
        }
        if (component instanceof TextBarComponent) {
            for (Map.Entry entry : userIdToNameMap.entrySet()) {
                if(entry.getKey().equals(component.getUserId())){
                    continue;
                }
                System.out.println(MessageFormat.format("Hi {0}, {1} has changed the status: {2}", entry.getValue(), userName, ((TextBarComponent) component).getText()));
            }
        } else if (component instanceof PhotoComponent) {
            System.out.println(MessageFormat.format("New photo for {0}! {1}", userName, ((PhotoComponent) component).getPhoto()));
        }
    }
}
