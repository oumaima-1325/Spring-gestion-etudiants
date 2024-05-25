package org.maven.tp2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceMock implements StudentService {
    private List<Student> students = new ArrayList<>();
    public Student createStudent(Student student) {
        students.add(student);
        return student;}
    public Student findStudentById(Long id) {
        return students.stream().filter(student ->
                student.getId().equals(id)).findFirst().orElse(null);}
    public List<Student> findAllStudents() {
        return new ArrayList<>(students);}
}

