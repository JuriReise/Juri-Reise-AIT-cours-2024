package homework_43.avg_student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAppl {
    public static void main(String[] args) {
        // Генерация данных
        List<Student> students = generateStudents(20);

        // Вывод всех студентов
        System.out.println("Все студенты:");
        students.forEach(System.out::println);

        // Поиск студентов с максимальным и минимальным средним баллом
        Optional<Student> maxAvgStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade));

        Optional<Student> minAvgStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade));

        System.out.println("\nCтудент с Максимальной средней оценкой:");
        maxAvgStudent.ifPresent(System.out::println);

        System.out.println("\nCтудент с минимальной средней оценкой:");
        minAvgStudent.ifPresent(System.out::println);
    }

    private static List<Student> generateStudents(int count) {
        Random random = new Random();
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            String name = "Студент " + i;
            List<Integer> grades = random.ints(10, 1, 6)
                    .boxed()
                    .collect(Collectors.toList());
            students.add(new Student(name, grades));
        }
        return students;
    }
}

