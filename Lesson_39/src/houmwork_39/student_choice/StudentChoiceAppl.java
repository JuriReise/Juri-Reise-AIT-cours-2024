package houmwork_39.student_choice;

public class StudentChoiceAppl {
    public static void main(String[] args) {
        IStudentSet<String> mathStudents = new MyStudentHashSet<>();
        IStudentSet<String> csStudents = new MyStudentHashSet<>();

        mathStudents.addElement("Alice");
        mathStudents.addElement("Bob");
        mathStudents.addElement("Charlie");

        csStudents.addElement("Bob");
        csStudents.addElement("Charlie");
        csStudents.addElement("Dave");

        System.out.println("Студенты записанные на два курса:");
        IStudentSet<String> commonStudents = mathStudents.intersection(csStudents);
        printSet(commonStudents);

        System.out.println("\nСтуденты записанные только на один курс:");
        IStudentSet<String> uniqueStudents = mathStudents.difference(csStudents);
        uniqueStudents = uniqueStudents.union(csStudents.difference(mathStudents));
        printSet(uniqueStudents);
    }

    private static void printSet(IStudentSet<String> set) {
        for (String student : set) {
            System.out.println(student);
        }
    }
}
