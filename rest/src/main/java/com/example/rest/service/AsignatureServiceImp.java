package com.example.rest.service;

import com.example.rest.models.Asignature;
import com.example.rest.repository.IAsignatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignatureServiceImp implements  IAsignatureService {

    @Autowired
    private IAsignatureRepository asignatureRepository;

    @Override
    public List<Asignature> findAll() {
        return asignatureRepository.findAll();
    }

    @Override
    public void save(Asignature asignature) {
        asignatureRepository.save(asignature);

    }

    @Override
    public Optional<Asignature> finOne(Long id) {
        return asignatureRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        asignatureRepository.deleteById(id);

    }

    @Override
    public Optional<Asignature> findByName(String name) {
        return asignatureRepository.findByName(name);
    }


}
