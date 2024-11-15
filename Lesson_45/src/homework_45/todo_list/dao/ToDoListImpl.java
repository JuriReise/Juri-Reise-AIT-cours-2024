package homework_45.todo_list.dao;



import homework_45.todo_list.model.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoListImpl implements ToDoList {
    private final List<Task> tasks;

    public ToDoListImpl() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public void saveToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Task task : tasks) {
                writer.write(task.serialize());
                writer.newLine();
            }
            System.out.println("Задачи сохранены в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении задач: " + e.getMessage());
        }
    }

    @Override
    public void loadFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            tasks.clear();
            while ((line = reader.readLine()) != null) {
                tasks.add(Task.deserialize(line));
            }
            System.out.println("Задачи загружены из файла: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении задач: " + e.getMessage());
        }
    }
}
