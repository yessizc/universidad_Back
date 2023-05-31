package com.example.rest.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "classroom_user")
public class Classroom_user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_student")
    private  Long idStudent;

    @Column (name = "id_aula")
    private Long idAula;

    @Column(name = "id_professor")
    private Long idProfessor;

    public Classroom_user(){}

    public Classroom_user(Long id, Long idStudent, Long idAula, Long idProfessor) {
        this.id = id;
        this.idStudent = idStudent;
        this.idAula = idAula;
        this.idProfessor = idProfessor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdAula() {
        return idAula;
    }

    public void setIdAula(Long idAula) {
        this.idAula = idAula;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }
}
