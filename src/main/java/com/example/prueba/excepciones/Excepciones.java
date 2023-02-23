package com.example.prueba.excepciones;

public class Excepciones extends Exception {

    public Excepciones(){   
    }

    public Excepciones(String msg){ //método para la publicación de mensajes de errores en HTML
        super(msg);
    }
}
