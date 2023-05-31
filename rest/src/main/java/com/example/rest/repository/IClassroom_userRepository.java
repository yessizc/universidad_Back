package com.example.rest.repository;

import com.example.rest.models.Classroom_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IClassroom_userRepository extends JpaRepository <Classroom_user,Long> {
}
