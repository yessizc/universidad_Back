package com.example.rest.service;

import com.example.rest.models.Classroom_user;
import com.example.rest.repository.IClassroom_userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Classroom_userServiceImp implements  IClassroom_userService{

    @Autowired
    private IClassroom_userRepository classroomUserRepository;

    @Override
    public List<Classroom_user> findAll() {
        return classroomUserRepository.findAll();
    }

    @Override
    public void save(Classroom_user classroomUser) {
         classroomUserRepository.save(classroomUser);

    }

    @Override
    public Optional<Classroom_user> findOne(Long id) {
        return classroomUserRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        classroomUserRepository.deleteById(id);

    }
}
