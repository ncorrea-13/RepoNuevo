package com.example.prueba.repositorios;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.prueba.entidades.Servicio;

@Repository
public interface ServicioRepo extends JpaRepository<Servicio, Long> {
    
    @Query("Select n from Servicio n where n.estrellas >= :estrellas") //Query para mostrar las 4 primeras recomendaciones
    public Servicio buscarPorNombre(@Param("estrellas") double estrellas);

}
