package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Asignatures")

public class Asignature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_professor")
    private Long idProfessor;

    @Column (name = "status")
    private Boolean status;


    public Asignature(){}

    public Asignature(Long id, String name, Long idProfessor, Boolean status) {
        this.id = id;
        this.name = name;
        this.idProfessor = idProfessor;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
