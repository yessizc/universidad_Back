package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name="users")

public class Users implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column (name = "document")
    private String document;

    @Column(name="id_rol")
    private  Long idRol;

    @Column(name="status")
    private  Boolean status;

    public Users(Long id, String name, String document, Long idRol, Boolean status) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.idRol = idRol;
        this.status = status;
    }

    public Users(){}

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
