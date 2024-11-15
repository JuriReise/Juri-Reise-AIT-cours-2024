
package Houmworck_34.event.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class EventModel {

    private int id;
    private String title;
    private String url;
    private LocalDateTime date;

    public EventModel(int id, String title, String url, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EventModel{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventModel)) return false;
        EventModel eventModel = (EventModel) o;
        return id == eventModel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
