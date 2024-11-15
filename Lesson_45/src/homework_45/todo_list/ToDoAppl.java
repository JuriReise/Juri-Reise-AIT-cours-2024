package homework_45.todo_list;

import homework_45.todo_list.dao.ToDoListImpl;
import homework_45.todo_list.model.Task;

import java.time.LocalDate;
import java.util.Scanner;

public class ToDoAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListImpl toDoList = new ToDoListImpl();

        String filePath = "tasks_with_dates.txt";

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Сохранить задачи в файл");
            System.out.println("4. Загрузить задачи из файла");
            System.out.println("5. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите описание задачи:");
                    String description = scanner.nextLine();

                    System.out.println("Введите дату выполнения (формат: ГГГГ-ММ-ДД):");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());

                    System.out.println("Введите срочность (Высокая, Средняя, Низкая):");
                    String priority = scanner.nextLine();

                    Task task = new Task(description, dueDate, priority);
                    toDoList.addTask(task);
                    break;

                case 2:
                    toDoList.getTasks().forEach(System.out::println);
                    break;

                case 3:
                    toDoList.saveToFile(filePath);
                    break;

                case 4:
                    toDoList.loadFromFile(filePath);
                    break;

                case 5:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Некорректный ввод.");
            }
        }
    }
}


