
package com.ecl.ECL.repository;

import com.ecl.ECL.model.Competicion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompeticionRepository extends JpaRepository<Competicion, Long> {
   Optional<Object> findByNombre(String nombre);

   Optional<Competicion> buscarCompeticion(String nombre);
}
