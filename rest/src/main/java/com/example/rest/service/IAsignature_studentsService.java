package com.example.rest.service;

import com.example.rest.models.Asignature_students;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IAsignature_studentsService {

    public List <Asignature_students> findAll();
    public  void save(Asignature_students asignatureStudents);
    public Optional <Asignature_students> findOne(Long id);
    public  void delete(Long id);
}
