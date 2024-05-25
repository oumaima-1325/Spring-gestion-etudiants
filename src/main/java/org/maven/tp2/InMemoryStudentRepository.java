package org.maven.tp2;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository // Spring est utilisée pour indiquer que la classe sert
// de dépôt de données (repository) et qu'elle interagit avec
// la base de données ou d'autres sources de données.
public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();
    public Student save(Student student) {
        students.add(student);
        return student;}
    public Optional<Student> findById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst();}
    public List<Student> findAll() {
        return new ArrayList<>(students);}
}
