package org.maven.tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // Déclare cette classe comme un bean de service Spring
//Cela signifie que Spring va détecter et gérer cette classe comme un bean,
//comme @Component mais mieux
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Autowired // Injecte automatiquement l'implémentation de StudentRepository
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;}
    public Student createStudent(Student student) {
        return studentRepository.save(student);}
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);}
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }}
