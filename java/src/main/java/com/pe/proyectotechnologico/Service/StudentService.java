package com.pe.proyectotechnologico.Service;

import com.pe.proyectotechnologico.Model.Student;
import com.pe.proyectotechnologico.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService implements CrudService<Student, Integer> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
