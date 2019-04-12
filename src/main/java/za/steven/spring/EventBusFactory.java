package za.steven.spring;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

public class EventBusFactory {
    private static EventBus eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
    public static EventBus getEventBus() {
        return eventBus;
    }
}
