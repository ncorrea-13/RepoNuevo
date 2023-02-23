package com.example.prueba.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.prueba.repositorios.ServicioRepo;
import com.example.prueba.entidades.Servicio;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceServicio {

    @Autowired
    private ServicioRepo serviRepo;

    public List<Servicio> listarServicio() {
        List<Servicio> servicio = new ArrayList();
        servicio = serviRepo.findAll();

        return servicio;
    }
}
