package homework_45.todo_list.model;

import java.time.LocalDate;

public class Task {
    private String description;
    private LocalDate dueDate;
    private String priority;

    public Task(String description, LocalDate dueDate, String priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return description + " | Дата: " + dueDate + " | Срочность: " + priority;
    }

    public String serialize() {
        return description + ";" + dueDate + ";" + priority;
    }

    public static Task deserialize(String line) {
        String[] parts = line.split(";");
        return new Task(parts[0], LocalDate.parse(parts[1]), parts[2]);
    }
}

