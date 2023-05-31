package com.example.rest.repository;

import com.example.rest.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassroomRepository extends JpaRepository <Classroom, Long> {
}
