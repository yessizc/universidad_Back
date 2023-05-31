package com.example.rest.service;


import com.example.rest.models.Users;
import com.example.rest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp  implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<Users> finAll() {

        return userRepository.findAll();
    }

    @Override
    public void save(Users users) {
        userRepository.save(users);

    }

    @Override
    public Optional<Users> findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Optional<Users> findByName(String name) {
        return userRepository.findByName(name);
    }


}
