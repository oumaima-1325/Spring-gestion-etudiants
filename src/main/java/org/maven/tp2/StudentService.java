package org.maven.tp2;
public interface StudentService {

    void createStudent(Student student);

    Student getStudentById(long id);

    void displayAllStudents();
}
