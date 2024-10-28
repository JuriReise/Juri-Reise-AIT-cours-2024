package houmwork_33.toDoList;
//Начать реализацию приложения "Список дел".
//    Использовать enum для организации меню (номер пункта, действие) приложения:
//    добавить задачу
//    посмотреть все задачи
//    удалить задачу (по номеру)
//    выйти из меню
//    Реализовать метод printMenu().

public enum ToDoList {

    ADD_TASK(1, "Добавить задачу"), VIEW_TASKS(2, "Посмотреть все задачи"), DELETE_TASK(3, "Удалить задачу"), EXIT(4, "Выйти из меню");

    private final int number;
    private final String action;

    ToDoList(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return number + ". " + action;
    }

    public static ToDoList fromNumber(int number) {
        for (ToDoList option : ToDoList.values()) {
            if (option.getNumber() == number) {
                return option;
            }
        }
        return null;
    }

}

