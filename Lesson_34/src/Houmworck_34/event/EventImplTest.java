
package Houmworck_34.event;

import Houmworck_34.event.dao.EventImpl;
import Houmworck_34.event.dao.EventRepository;
import Houmworck_34.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EventImplTest {

    private EventImpl eventImpl;

    @BeforeEach
    void setUp() {
        eventImpl = new EventImpl();
    }

    @Test
    void testAddEvent() {
        Event event = new Event(1, "Title1", "url1", LocalDateTime.now());
        assertTrue(eventImpl.addEvent((EventRepository) event));
        assertEquals(1, eventImpl.size());
    }

    @Test
    void testRemoveEvent() {
        Event event = new Event(1, "Title1", "url1", LocalDateTime.now());
        eventImpl.addEvent((EventRepository) event);
        assertTrue(eventImpl.removeEvent(1));
        assertEquals(0, eventImpl.size());
    }

    @Test
    void testUpdateEvent() {
        Event event = new Event(1, "Title1", "url1", LocalDateTime.now());
        eventImpl.addEvent((EventRepository) event);
        assertTrue(eventImpl.updateEvent(1, "newUrl"));
        assertEquals("newUrl", eventImpl.getEventById(1).getUrl());
    }

    @Test
    void testGetEventById() {
        Event event = new Event(1, "Title1", "url1", LocalDateTime.now());
        eventImpl.addEvent((EventRepository) event);
        assertNotNull(eventImpl.getEventById(1));
        assertNull(eventImpl.getEventById(2));
    }

    @Test
    void testGetEventsBetweenDates() {
        LocalDateTime now = LocalDateTime.now();
        Event event1 = new Event(1, "Title1", "url1", now.minusDays(1));
        Event event2 = new Event(2, "Title2", "url2", now);
        eventImpl.addEvent((EventRepository) event1);
        eventImpl.addEvent((EventRepository) event2);
        List<Event> events = eventImpl.getEventsBetweenDates(now.toLocalDate().minusDays(1), now.toLocalDate());
        assertEquals(2, events.size());
    }

    @Test
    void testSize() {
        assertEquals(0, eventImpl.size());
        eventImpl.addEvent((EventRepository) new Event(1, "Title1", "url1", LocalDateTime.now()));
        assertEquals(1, eventImpl.size());
    }
}
