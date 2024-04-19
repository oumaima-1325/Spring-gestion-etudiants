package org.maven.tp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private final Map<Long, Student> studentsMap = new HashMap<>();

    @Override
    public void save(Student student) {
        studentsMap.put(student.getId(), student);
    }

    @Override
    public Student findById(long id) {
        return studentsMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentsMap.values());
    }
}

