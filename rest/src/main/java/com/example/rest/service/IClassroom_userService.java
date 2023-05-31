package com.example.rest.service;

import com.example.rest.models.Classroom_user;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IClassroom_userService {

    public List <Classroom_user> findAll();
    public void save(Classroom_user classroomUser);
    public Optional <Classroom_user> findOne(Long id);
    public  void  delete(Long id);
}
