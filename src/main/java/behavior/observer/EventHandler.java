package behavior.observer;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EventHandler {

    private Map<Class<?>, Set<EventListener>> listenerMap = new ConcurrentHashMap<>();

    public void addListener(EventListener listener) {
        Class<?> eventClazz = getEventClazz(listener);
        Set<EventListener> listeners = listenerMap.get(eventClazz);
        if (listeners == null) {
            listeners = new HashSet<>();
            listenerMap.put(eventClazz, listeners);
        }
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listenerMap.values().forEach(s -> s.remove(listener));
    }

    public void dispatch(Event event) {
        listenerMap.entrySet().forEach(entry -> {
            if (entry.getKey().isAssignableFrom(event.getClass())) {
                entry.getValue().forEach(l -> l.handle(event));
            }
        });
    }

    private Class<?> getEventClazz(EventListener listener) {
        Method[] methods = listener.getClass().getDeclaredMethods();
        Class<?> eventClazz = null;
        for (Method method : methods) {
            if (!method.getName().equals("handle")) {
                continue;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length != 1) {
                continue;
            }
            if (Event.class.isAssignableFrom(parameterTypes[0])) {
                eventClazz = parameterTypes[0];
                break;
            }
        }
        return eventClazz;
    }
}
