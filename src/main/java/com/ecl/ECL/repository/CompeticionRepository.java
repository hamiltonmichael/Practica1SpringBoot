package com.ecl.ECL.repository;

import com.ecl.ECL.model.Competicion;
import com.ecl.ECL.model.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompeticionRepository extends JpaRepository<Competicion, Long> {
    static Optional<Competicion> buscarCompeticion(String nombre) {
        return null;
    }
}
