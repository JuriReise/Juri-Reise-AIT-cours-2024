
package Houmworck_34.event.dao;

import Houmworck_34.event.model.Event;
import Houmworck_34.event.model.EventModel;
import java.time.LocalDate;
import java.util.List;

public class EventImpl implements EventRepository {
    private EventModel[] events;
    private int size;

    public EventImpl() {
        this.events = new EventModel[size];
        this.size = 0;
    }

    @Override
    public boolean addEvent(EventModel event) {
        if (size >= events.length) {
            return false; // No space left in array
        }
        events[size++] = event;
        return true;
    }

    @Override
    public boolean addEvent(EventRepository event) {
        return false;
    }

    @Override
    public boolean removeEvent(int id) {
        for (int i = 0; i < size; i++) {
            if (events[i].getId() == id) {
                events[i] = events[--size]; // Replace with last item and decrease size
                events[size] = null; // Nullify the removed slot
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateEvent(int id, String url) {
        EventModel event = getEventById(id);
        if (event != null) {
            event.setUrl(url);
            return true;
        }
        return false;
    }

    @Override
    public EventRepository getEventById(int id) {
        for (int i = 0; i < size; i++) {
            if (events[i].getId() == id) {
                return events[i];
            }
        }
        return null;
    }

    @Override
    public List<Event> getEventsBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
        EventModel[] result = new EventModel[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            LocalDate eventDate = events[i].getDate().toLocalDate();
            if ((eventDate.isEqual(dateFrom) || eventDate.isAfter(dateFrom)) &&
                (eventDate.isEqual(dateTo) || eventDate.isBefore(dateTo))) {
                result[count++] = events[i];
            }
        }
        // Trim the result array to actual number of matching elements
        EventModel[] trimmedResult = new EventModel[count];
        System.arraycopy(result, 0, trimmedResult, 0, count);
        return trimmedResult;
    }

    @Override
    public int size() {
        return size;
    }
}
