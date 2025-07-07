package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManagementApp {

    private List<Student> students;
    private StudentService studentService;
    private OutputPrinter printer;

    public StudentManagementApp() {

        this.studentService = new StudentService();
        this.printer = new OutputPrinter();

        this.students = new ArrayList<>(Arrays.asList(
                new Student("Adolfo", 25, "Java", 7.5f),
                new Student("Pepe", 22, "Math", 6.0f),
                new Student("Christian", 19, "PHP", 4.5f),
                new Student("David", 21, "Java", 8.0f),
                new Student("Eve", 20, "PHP", 9.0f),
                new Student("Frank", 18, "Java", 5.0f),
                new Student("Maria", 23, "SQL", 7.0f),
                new Student("Ana", 20, "Java", 3.0f),
                new Student("andreu", 25, "C++", 8.5f),
                new Student("Alfonso", 21, "PHP", 6.5f)
        ));
    }

    public void run() {
        studentService.displayStudentNamesAndAges(students);

        List<Student> studentsStartingWithA = studentService.filterStudents(
                students,
                student -> student.getName().toLowerCase().startsWith("a")
        );
        printer.printList("\n--- Students whose name starts with 'a' ---", studentsStartingWithA);

        List<Student> studentsWithGoodGrades = studentService.filterStudents(
                students,
                student -> student.getGrade() >= 5.0f
        );
        printer.printList("\n--- Students with a grade of 5 or higher ---", studentsWithGoodGrades);

        List<Student> goodGradeNonPHPStudents = studentService.filterStudents(
                students,
                student -> student.getGrade() >= 5.0f && !student.getCourse().equalsIgnoreCase("PHP")
        );
        printer.printList("\n--- Students with grade >= 5 and NOT from PHP ---", goodGradeNonPHPStudents);

        List<Student> adultJavaStudents = studentService.filterStudents(
                students,
                student -> student.getCourse().equalsIgnoreCase("Java") && student.getAge() >= 18
        );
        printer.printList("\n--- Adult Java Students ---", adultJavaStudents);
    }
}