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
    private double estrellas; //cantidad de estrellas promedio del servicio
    private String nombre; //título del servicio
    private String descripcion; //descripción de este servicio
    //queda pendiente posibilidad de imágenes

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
