package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "asignature_students")

public class Asignature_students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "idAsignature")
    private Long idAsignature;

    public Asignature_students(){}

    public Asignature_students(Long id, Long idUser, Long idAsignature) {
        this.id = id;
        this.idUser = idUser;
        this.idAsignature = idAsignature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdAsignature() {
        return idAsignature;
    }

    public void setIdAsignature(Long idAsignature) {
        this.idAsignature = idAsignature;
    }
}
