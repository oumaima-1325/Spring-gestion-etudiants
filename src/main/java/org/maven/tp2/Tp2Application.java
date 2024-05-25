package org.maven.tp2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tp2Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
        // Create students
        Student student1 = new Student(1L, "John Doe", 20);
        Student student2 = new Student(2L, "Jane Smith", 22);
        studentService.createStudent(student1);
        studentService.createStudent(student2);
        // Find student by ID
        Student foundStudent = studentService.findStudentById(1L);
        System.out.println("Found Student: " + foundStudent.getName());
        // Display all students
        System.out.println("All Students:");
        studentService.findAllStudents().forEach(student -> System.out.println(student.getName()));
        context.close();
    }

}
