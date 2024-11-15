package homework_45.todo_list.test;


import homework_45.todo_list.dao.ToDoListImpl;
import homework_45.todo_list.model.Task;

import java.time.LocalDate;

public class ToDoListImplTest {
    public static void main(String[] args) {
        ToDoListImpl toDoList = new ToDoListImpl();

        Task task1 = new Task("Сделать домашнее задание", LocalDate.of(2024, 11, 20), "Высокая");
        Task task2 = new Task("Купить продукты", LocalDate.of(2024, 11, 15), "Средняя");

        toDoList.addTask(task1);
        toDoList.addTask(task2);

        System.out.println("Список задач:");
        toDoList.getTasks().forEach(System.out::println);

        String filePath = "test_tasks.txt";
        toDoList.saveToFile(filePath);
        toDoList.loadFromFile(filePath);

        System.out.println("\nСписок задач после загрузки:");
        toDoList.getTasks().forEach(System.out::println);
    }
}
