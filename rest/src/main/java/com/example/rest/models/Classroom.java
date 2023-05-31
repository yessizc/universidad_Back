package com.example.rest.models;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "classroom")

public class Classroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "indicator")
    private String indicator;

    @Column(name = "status")
    private Boolean status;

    public Classroom(){}

    public Classroom(Long id, String indicator, Boolean status) {
        this.id = id;
        this.indicator = indicator;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
