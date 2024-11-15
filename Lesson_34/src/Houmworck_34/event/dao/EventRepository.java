
package Houmworck_34.event.dao;

import Houmworck_34.event.model.Event;
import Houmworck_34.event.model.EventModel;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository {

    boolean addEvent(EventModel event);

    boolean addEvent(EventRepository event);
    boolean removeEvent(int id);
    boolean updateEvent(int id, String url);
    EventRepository getEventById(int id);
    List<Event> getEventsBetweenDates(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
