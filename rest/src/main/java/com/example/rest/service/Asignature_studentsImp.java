package com.example.rest.service;

import com.example.rest.models.Asignature_students;
import com.example.rest.repository.IAsignatureRepository;
import com.example.rest.repository.IAsignature_studentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class Asignature_studentsImp  implements IAsignature_studentsService{

    @Autowired
    private IAsignature_studentsRepository asignatureStudentsRepository;
    @Override
    public List<Asignature_students> findAll() {
        return asignatureStudentsRepository.findAll();

    }

    @Override
    public void save(Asignature_students asignatureStudents) {
        asignatureStudentsRepository.save(asignatureStudents);

    }

    @Override
    public Optional<Asignature_students> findOne(Long id) {
        return asignatureStudentsRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        asignatureStudentsRepository.deleteById(id);

    }
}
