package org.maven.tp2;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
