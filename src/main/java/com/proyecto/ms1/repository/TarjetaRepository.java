package com.proyecto.ms1.repository;

import com.proyecto.ms1.model.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

    // Query derivada automáticamente del nombre del método:
    // Spring Data JPA genera el SQL "SELECT * FROM tarjeta WHERE pasajero_id = ?"
    List<Tarjeta> findByPasajeroId(Long pasajeroId);
}