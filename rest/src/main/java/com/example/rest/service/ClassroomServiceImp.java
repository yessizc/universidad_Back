package com.example.rest.service;

import com.example.rest.models.Classroom;
import com.example.rest.repository.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomServiceImp implements IClassroomService{

    @Autowired
    private IClassroomRepository classroomRepository;

    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public void save(Classroom classroom) {
        classroomRepository.save(classroom);

    }

    @Override
    public Optional<Classroom> findOne(Long id) {
        return classroomRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        classroomRepository.deleteById(id);

    }
}
