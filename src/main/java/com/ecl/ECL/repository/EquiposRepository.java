
package com.ecl.ECL.repository;

import com.ecl.ECL.model.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface EquiposRepository extends JpaRepository<Equipos, Long> {
    @Query("select pais from Equipos eq where eq.nombre=:nombre")
    Optional<String> buscarPaisByNombre(String nombre);

    Optional<Object> findByNombre(String nombre);

    Optional<Equipos> buscarEquipo(String nombre);
}
