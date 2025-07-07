package level3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class StudentService {

    public List<Student> filterStudents(List<Student> students, Predicate<Student> criterion) {
        if (students == null) {
            return List.of();
        }
        return students.stream()
                .filter(criterion)
                .collect(Collectors.toList());
    }

    public void displayStudentNamesAndAges(List<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students to display names and ages.");
            return;
        }
        System.out.println("--- Student Names and Ages ---");
        students.forEach(student -> System.out.println("Name: " + student.getName() + ", Age: " + student.getAge()));
    }
}