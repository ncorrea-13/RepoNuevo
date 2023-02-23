package com.example.prueba.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.prueba.repositorios.ServicioRepo;
import com.example.prueba.entidades.Servicio;
import com.example.prueba.excepciones.Excepciones;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceServicio {

    @Autowired
    private ServicioRepo serviRepo;

    public List<Servicio> listarServicio() {
        List<Servicio> servicio = new ArrayList(); //Lista hecha para mostrar los servicios
        servicio = serviRepo.findAll(); //trae servicios desde la base de datos

        return servicio;
    }

    public void crearServicio(String titulo, Double estrellas, String decripcion) throws Excepciones {
        validarExcepciones(titulo, estrellas, decripcion); //validación de excepciones

        Servicio servi = new Servicio();

        servi.setNombre(titulo);
        servi.setEstrellas(estrellas);
        servi.setDescripcion(decripcion);

        serviRepo.save(servi); //guardo el servicio en la base de datos

    }

    public void validarExcepciones(String titulo, Double estrellas, String descripcion) throws Excepciones { //validación de excepciones a la hora de crear

        if (titulo.isBlank() || titulo.isEmpty()){ //método para validar el título
            throw new Excepciones("El título no debe ser nulo");
        }

        if (estrellas == 0){ //método para validar las estrellas
            throw new Excepciones("Debe proporcionar puntuación");
        }

        if (descripcion.isBlank() || descripcion.isEmpty()){  //método para validar la descripción
            throw new Excepciones("La descripción no debe estar vacía");
        }

    }
}
