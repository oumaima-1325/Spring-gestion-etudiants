package org.maven.tp2;

import java.util.List;

public interface StudentRepository {

    void save(Student student);

    Student findById(long id);

    List<Student> findAll();
}
