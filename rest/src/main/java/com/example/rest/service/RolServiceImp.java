package com.example.rest.service;

import com.example.rest.models.Rol;
import com.example.rest.repository.IRolRepository;
import com.example.rest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class RolServiceImp implements IRolService {

    @Autowired
    private IRolRepository rolRepository;
    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public void save(Rol rol) {
        rolRepository.save(rol);

    }

    @Override
    public Optional<Rol> findOne(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        rolRepository.deleteById(id);

    }
}
