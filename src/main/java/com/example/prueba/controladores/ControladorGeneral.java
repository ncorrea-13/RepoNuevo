package com.example.prueba.controladores;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.prueba.entidades.Servicio;
import com.example.prueba.servicios.ServiceServicio;

@Controller
@RequestMapping("/")
public class ControladorGeneral {

    private ServiceServicio servi;

    @GetMapping("/")
    public String index(ModelMap modelo) {

        try { // hay que mejorar como está hecho esto, la idea es agarrar cuando no hay ningún
              // servicio
            List<Servicio> servicios = servi.listarServicio();

            modelo.addAttribute("Servicios", servicios); //agrega servicios en el index

        } catch (Exception nulException) {

        }
        return "index.html";
    }

    @GetMapping("/registro") // llamado de localhost:8080/registro
    public String registrar() {
        return "registro.html";
    }

    @GetMapping("/login") // llamado de localhost:8080/login
    public String login() {
        return "login.html";
    }
}
