package houmwork_33.toDoList;
// Сканер +
// Метод для меню +
// Метод для добавления задачи +
// Метод для просмотра добавленных задач +
// Метод для удаления задачи +

import java.util.List;
import java.util.Scanner;

public class ToDoListAppl {

    private String[] tasks = new String[10];
    private int taskCount = 0;

    public static void main(String[] args) {
        ToDoListAppl app = new ToDoListAppl();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        ToDoList option;

        do {
            printMenu();
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            option = ToDoList.fromNumber(choice);

            if (option != null) {
                switch (option) {
                    case ADD_TASK:
                        addTask(scanner);
                        break;
                    case VIEW_TASKS:
                        viewTasks();
                        break;
                    case DELETE_TASK:
                        deleteTask(scanner);
                        break;
                    case EXIT:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Некорректный ввод.");
                }
            } else {
                System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        } while (option != ToDoList.EXIT);
    }

    void addTask(Scanner scanner) {
        if (taskCount >= tasks.length) {
            System.out.println("Список задач заполнен. Невозможно добавить новую задачу.");
            return;
        }

        System.out.print("Введите задачу: ");
        scanner.nextLine();
        String task = scanner.nextLine();
        tasks[taskCount] = task;
        taskCount++;
        System.out.println("Задача добавлена.");
    }

    void viewTasks() {
        if (taskCount == 0) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Ваши задачи:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }
    }

    void deleteTask(Scanner scanner) {
        if (taskCount == 0) {
            System.out.println("Список задач пуст. Нечего удалять.");
            return;
        }

        viewTasks();
        System.out.print("Введите номер задачи для удаления: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("Некорректный номер задачи.");
        } else {

            for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null;
            taskCount--;
            System.out.println("Задача удалена.");
        }
    }

    private void printMenu() {
        System.out.println("\nМеню:");
        for (ToDoList option : ToDoList.values()) {
            System.out.println(option);
        }
    }

    public List<String> getTasks() {
        return List.of(tasks);
    }
}
