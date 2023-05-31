package com.example.rest.repository;

import com.example.rest.models.Asignature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAsignatureRepository extends JpaRepository <Asignature, Long> {

    public Optional<Asignature> findByName(String name);
}
