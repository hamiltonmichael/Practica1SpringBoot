package com.ecl.ECL.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.ecl.ECL.model.Equipos;
import com.ecl.ECL.repository.EquiposRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquiposController {

    private final EquiposRepository repository;

    public EquiposController(EquiposRepository repository) {
        this.repository = repository;
    }

    //Agregate root
    //tag::get-aggregate-root[]
    @GetMapping("/equipos")
    List<Equipos> all(){
        return repository.findAll();
    }
    //end::get-aggregate-root[]

    @PostMapping("/equipos")
    Equipos newEquipos(@RequestBody Equipos newEquipos){
        return repository.save(newEquipos);
    }

    //Single item

    @GetMapping("/equipos/{id}")
    Equipos one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/equipos/{id}")
    Equipos replaceEquipos(@RequestBody Equipos newEquipos, @PathVariable Long id){
        return repository.findById(id)
                .map(equipos -> {
                    equipos.setNombre(newEquipos.getNombre());
                    equipos.setPais(newEquipos.getPais());
                    equipos.setEquipoRivalHistoricamente(newEquipos.getEquipoRivalHistoricamente());
                    equipos.setEscudo(newEquipos.getEscudo());
                    return repository.save(equipos);
                })
                .orElseGet(()->{
                    newEquipos.setId(id);
                    return repository.save(newEquipos);
                });

    }
    //Delete Item (in this case team)
    @DeleteMapping("/equipos/{id}")
    void deleteEquipos(@PathVariable Long id){
        repository.deleteById(id);
    }
}
