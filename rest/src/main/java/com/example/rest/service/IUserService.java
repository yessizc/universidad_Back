package com.example.rest.service;

import com.example.rest.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public interface IUserService {

    public List<Users> finAll();

    public  void save (Users users);

    public Optional <Users> findOne (Long id);

    public  void delete (long id);

    public Optional <Users> findByName(String name);
}
