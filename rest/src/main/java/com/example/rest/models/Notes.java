package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "notes")

public class Notes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "note")
    private int note;

    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "id_asignature")
    private Long idAsignature;

    @Column(name = "status")
    private Boolean status;

    public Notes(){}

    public Notes(Long id, int note, Long idUser, Long idAsignature, Boolean status) {
        this.id = id;
        this.note = note;
        this.idUser = idUser;
        this.idAsignature = idAsignature;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdAsignature() {
        return idAsignature;
    }

    public void setIdAsignature(Long idAsignature) {
        this.idAsignature = idAsignature;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
