package homework_45.todo_list.dao;

import homework_45.todo_list.model.Task;

import java.util.List;

public interface ToDoList {
    void addTask(Task task);
    List<Task> getTasks();
    void saveToFile(String filePath);
    void loadFromFile(String filePath);
}

