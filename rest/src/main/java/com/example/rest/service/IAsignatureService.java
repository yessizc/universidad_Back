package com.example.rest.service;

import com.example.rest.models.Asignature;
import com.example.rest.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IAsignatureService {

    public List <Asignature> findAll();

    public  void  save( Asignature asignature);

    public Optional <Asignature> finOne(Long id);

    public void  delete(Long id);
    public Optional<Asignature> findByName(String asignature_name);
}
