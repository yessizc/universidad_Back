package com.example.rest.service;

import com.example.rest.models.Rol;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IRolService {

    public List <Rol> findAll();
    public void save (Rol rol);
    public Optional <Rol> findOne (Long id);
    public  void delete(Long id);
}
