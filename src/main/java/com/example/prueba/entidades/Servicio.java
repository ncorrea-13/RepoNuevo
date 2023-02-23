package com.example.prueba.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //Id único del servicio
    private double estrellas;
    private String nombre;
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getEstrellas(){
        return estrellas;
    }

    public void setEstrellas(double estrellas){
        this.estrellas = estrellas;
    }
}
