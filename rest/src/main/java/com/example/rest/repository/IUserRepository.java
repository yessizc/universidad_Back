package com.example.rest.repository;


import com.example.rest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository  extends JpaRepository <Users, Long > {
    public Optional<Users> findByName(String name);
}
