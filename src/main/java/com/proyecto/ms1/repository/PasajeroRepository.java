package com.proyecto.ms1.repository;

import com.proyecto.ms1.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {
    // findById, findAll, save, deleteById ya vienen incluidos gratis
}