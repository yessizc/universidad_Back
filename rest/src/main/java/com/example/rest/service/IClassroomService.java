package com.example.rest.service;

import com.example.rest.models.Classroom;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IClassroomService {

    public List <Classroom> findAll();

    public void save(Classroom classroom);

    public Optional <Classroom> findOne(Long id);

    public void delete (Long id);

}
