package org.maven.tp2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tp2Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);

        // Création
        Student etudiante1 = new Student(1, "oumaima achour", 22);
        Student etudiante2 = new Student(2, "taylor swift", 33);

        //
        studentService.createStudent(etudiante1);
        studentService.createStudent(etudiante2);

        //
        Student retrievedStudent1 = studentService.getStudentById(1);
        Student retrievedStudent2 = studentService.getStudentById(2);
        System.out.println("1-le premier etudiant: " + retrievedStudent1);
        System.out.println("2-le deuxieme etudiant : " + retrievedStudent1);

        studentService.displayAllStudents();

    }

}
