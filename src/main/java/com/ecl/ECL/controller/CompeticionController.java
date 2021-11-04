
package com.ecl.ECL.controller;


import com.ecl.ECL.model.Competicion;
import com.ecl.ECL.repository.CompeticionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CompeticionController {

    private final CompeticionRepository competicionRepository;



    /**
     * Constructor de la clase CompeticionController
     * @param competicionRepository
     */
    public CompeticionController(CompeticionRepository competicionRepository) {
        this.competicionRepository = competicionRepository;
    }


    /**
     * Este método muestra las competiciones existentes.
     */
    @GetMapping("/competicion")
    List<Competicion> all(){
        return competicionRepository.findAll();
    }


    /**
     * Este método permite la creación de una competición que no exista todavía.
     * @param newCompeticion
     */
    @PostMapping("/competicion")
    Competicion newCompeticion(@RequestBody Competicion newCompeticion){
        if (competicionRepository.buscarCompeticion(newCompeticion.getNombreCompeticion()).isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return competicionRepository.save(newCompeticion);
    }

    /**
     * Este método permite mostrar los datos de una competición determinada.
     * @param id
     */
    @GetMapping("/competicion/{id}")
    Competicion one(@PathVariable Long id){
        return competicionRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    /**
     * Este método permite modificar los parámetros de una competición que ya existe.
     * @param newCompeticion
     * @param id
     */
    @PutMapping("/competicion/{id}")
    Competicion replaceCompeticion(@RequestBody Competicion newCompeticion, @PathVariable Long id){
        if (competicionRepository.buscarCompeticion(newCompeticion.getNombreCompeticion()).isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return competicionRepository.findById(id)
                .map(competicion -> {
                    competicion.setNombreCompeticion(newCompeticion.getNombreCompeticion());
                    return competicionRepository.save(competicion);
                })
                .orElseGet(()->{
                    newCompeticion.setIdCompeticion(id);
                    return competicionRepository.save(newCompeticion);
                });

    }

    /**
     * Este método permite eliminar una competición.
     * @param id
     */
    @DeleteMapping("/competicion/{id}")
    void deleteCompeticion(@PathVariable Long id){
        competicionRepository.deleteById(id);
    }

}
