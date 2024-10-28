package houmwork_33.dayOfTheWeeks;
//Задать ENUM weekDay - дни недели.
// Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг)
// Проверьте работу метода с помощью теста.

public enum DayOfWeek {
    MON("Monday", 1, "workday"), TUE("Tuesday", 2, "workday"), WED("Wednesday", 3, "workday"), THU("Thursday", 4, "workday"), FRI("Friday", 5, "workday"), SAT("Saturday", 6, "weekend"), SUN("Sunday", 7, "weekend");

    // felds
    private String name;
    private int numDay;
    private String type;

    // constr

    DayOfWeek(String name, int numDay, String type) {
        this.name = name;
        this.numDay = numDay;
        this.type = type;
    }
    // get
    public String getName() {
        return name;
    }

    public int getNumDay() {
        return numDay;
    }

    public String getType() {
        return type;
    }
    //toSring


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayOfWeek{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numDay=").append(numDay);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public DayOfWeek plusDay(int quantity) {
        int n = this.ordinal();
        DayOfWeek[] days = DayOfWeek.values();
        int res = (n + quantity) % days.length;

        // Для обработки отрицательных значений
        if (res < 0) {
            res += days.length;
        }

        return days[res];

    }
}
