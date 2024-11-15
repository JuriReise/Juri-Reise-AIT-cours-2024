package houmwork_33.toDoList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ToDoListTest {

    private ToDoListAppl app;

@BeforeEach
    public void setUp() {
        app = new ToDoListAppl();  // создаем новый экземпляр перед каждым тестом
    }

    @Test
    public void testAddTask() {
        String input = "Купить молоко\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        app.addTask(new java.util.Scanner(System.in));

        List<String> tasks = app.getTasks();
        assertEquals(1, tasks.size(), "Должна быть добавлена одна задача");
        assertEquals("Купить молоко", tasks.get(0), "Задача должна быть 'Купить молоко'");
    }

    @Test
    public void testViewTasks() {
        app.addTask(new java.util.Scanner(new ByteArrayInputStream("Купить хлеб\n".getBytes())));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        app.viewTasks();

        String output = out.toString();
        assertTrue(output.contains("1. Купить хлеб"), "Вывод должен содержать добавленную задачу");
    }

    @Test
    public void testDeleteTask() {
        app.addTask(new java.util.Scanner(new ByteArrayInputStream("Купить хлеб\n".getBytes())));
        app.addTask(new java.util.Scanner(new ByteArrayInputStream("Помыть машину\n".getBytes())));

        System.setIn(new ByteArrayInputStream("1\n".getBytes()));

        app.deleteTask(new java.util.Scanner(System.in));

        List<String> tasks = app.getTasks();
        assertEquals(1, tasks.size(), "Должна остаться одна задача после удаления");
        assertEquals("Помыть машину", tasks.get(0), "Оставшаяся задача должна быть 'Помыть машину'");
    }
}
