package org.maven.tp2;

public class StudentServiceMock implements StudentService {
    @Override
    public void createStudent(Student student) {

        System.out.println("Creation de l'etudiant: " + student.getName());
    }

    @Override
    public Student getStudentById(long id) {

        return new Student(id, " etudiant Mock", 22);
    }

    @Override
    public void displayAllStudents() {

        System.out.println("affichage des etudiants ");
    }
}

