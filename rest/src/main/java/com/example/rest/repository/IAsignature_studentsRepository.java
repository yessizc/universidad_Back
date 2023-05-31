package com.example.rest.repository;

import com.example.rest.models.Asignature_students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAsignature_studentsRepository extends JpaRepository <Asignature_students, Long> {
}
