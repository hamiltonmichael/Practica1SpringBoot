package com.ecl.ECL.repository;

import com.ecl.ECL.model.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquiposRepository extends JpaRepository<Equipos, Long> {
    Optional<Equipos> buscarEquipo(String nombre2);
}
