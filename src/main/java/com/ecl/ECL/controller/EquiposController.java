package com.ecl.ECL.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.ecl.ECL.model.Equipos;
import com.ecl.ECL.repository.EquiposRepository;

import java.util.List;

/**
 * Clase EquiposController, en la que permite escoger la acción que se desea realizar relacionado con
 * los equipos que forman cada competición existente. Permite mostrar los equipos, añadir equipos,
 * modificar equipos ya existente y eliminar equipos existentes.
 */
@RestController
public class EquiposController {

    private final EquiposRepository equiposRepository;

    /**
     * Constructor de la clase EquiposController
     * @param equiposRepository
     */
    public EquiposController(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    /**
     * Este método muestra los equipos de una competición.
     */
    @GetMapping("/equipos")
    List<Equipos> all(){
        return equiposRepository.findAll();
    }

    /**
     * Este método permite la creación de un equipo que no exista todavía.
     * @param newEquipos
     */
    @PostMapping("/equipos")
    Equipos newEquipos(@RequestBody Equipos newEquipos){
        if (equiposRepository.buscarEquipo(newEquipos.getNombre()).isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return equiposRepository.save(newEquipos);
    }

    /**
     * Este método permite mostrar los datos de un equipo determinado.
     * @param id
     */
    @GetMapping("/equipos/{id}")
    Equipos one(@PathVariable Long id){
        return equiposRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    /**
     * Este método permite modificar los parámetros de un equipo que ya existe.
     * @param newEquipos
     * @param id
     */
    @PutMapping("/equipos/{id}")
    Equipos replaceEquipos(@RequestBody Equipos newEquipos, @PathVariable Long id){
        if (equiposRepository.buscarEquipo(newEquipos.getNombre()).isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return equiposRepository.findById(id)
                .map(equipos -> {
                    equipos.setNombre(newEquipos.getNombre());
                    equipos.setPais(newEquipos.getPais());
                    equipos.setEquipoRivalHistoricamente(newEquipos.getEquipoRivalHistoricamente());
                    equipos.setEscudo(newEquipos.getEscudo());
                    return equiposRepository.save(equipos);
                })
                .orElseGet(()->{
                    newEquipos.setId(id);
                    return equiposRepository.save(newEquipos);
                });

    }

    /**
     * Este método permite eliminar un equipo existente.
     * @param id
     */
    @DeleteMapping("/equipos/{id}")
    void deleteEquipos(@PathVariable Long id){
        equiposRepository.deleteById(id);
    }
}
