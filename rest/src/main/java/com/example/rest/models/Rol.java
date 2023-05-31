package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "rol")

public class Rol implements Serializable {

    private  static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private Long id;

    @Column(name = "rolName")
    private String rolName;

    @Column(name = "description")
    private String description;

    @Column (name = "status")
    private Boolean status;


    public Rol(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Rol(Long id, String rolName, String description, Boolean status) {
        this.id = id;
        this.rolName = rolName;
        this.description = description;
        this.status = status;


    }


}
