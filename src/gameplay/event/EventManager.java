package gameplay.event;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Listener> listeners;

    public EventManager() {
        this.listeners = new ArrayList<Listener>();
    }

    public void registerListener(Listener listener) {
        listeners.add(listener);
    }

    public void unregisterListener(Listener listener) {
        listeners.remove(listener);
    }

    public void fireEvent(Event e) {
        for (Listener listener : listeners) {
            listener.onEvent(e);
        }
    }
}
