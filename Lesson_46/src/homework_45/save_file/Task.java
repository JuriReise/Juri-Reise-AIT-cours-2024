package homework_45.save_file;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable {

    private String task; // содержание задачи
    private LocalDate date; // дата создания задачи

    // constructor
    public Task(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    // геттеры и сеттеры
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // метод toString
    @Override
    public String toString() {
        return task + ", data: " + date;
    }

}
