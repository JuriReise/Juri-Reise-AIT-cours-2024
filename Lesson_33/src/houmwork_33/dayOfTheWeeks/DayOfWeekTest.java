package houmwork_33.dayOfTheWeeks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeekTest {

    @Test
    public void testPlusDay() {
        // Проверка на добавление 0 дней
        assertEquals(DayOfWeek.MON, DayOfWeek.MON.plusDay(0), "Monday + 0 days should be Monday");

        // Проверка на добавление 1 дня
        assertEquals(DayOfWeek.TUE, DayOfWeek.MON.plusDay(1), "Monday + 1 day should be Tuesday");

        // Проверка на добавление 7 дней (должен остаться тот же день)
        assertEquals(DayOfWeek.MON, DayOfWeek.MON.plusDay(7), "Monday + 7 days should be Monday");

        // Проверка на добавление 10 дней
        assertEquals(DayOfWeek.THU, DayOfWeek.MON.plusDay(10), "Monday + 10 days should be Thursday");

        // Проверка на добавление отрицательного количества дней (-3 дня от Monday)
        assertEquals(DayOfWeek.FRI, DayOfWeek.MON.plusDay(-3), "Monday - 3 days should be Friday");
    }

}