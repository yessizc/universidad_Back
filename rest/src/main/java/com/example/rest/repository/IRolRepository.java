package com.example.rest.repository;

import com.example.rest.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRolRepository extends JpaRepository <Rol, Long> {
}
