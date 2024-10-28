package houmwork_33.dayOfTheWeeks;

public class DayOfWeekAppl {
    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.MON;
        System.out.println("Start month: " + day);

        int td = 10;

        day = day.plusDay(td);
        System.out.println("After " + td + " day: " + day);

    }

}
