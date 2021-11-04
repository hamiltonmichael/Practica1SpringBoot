package com.ecl.ECL.repository;

import com.ecl.ECL.model.Competicion;
import com.ecl.ECL.model.Equipos;
import com.ecl.ECL.model.Ganadores;
import com.ecl.ECL.model.PaisesAdmitidos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase LoadDatabase, en la que permite añadir todos los datos necesarios y deseados para
 * cada equipo, países admitidos, ganadores y competición antes de inicializar el programa.
 */
@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EquiposRepository equiposRepository,
                                   GanadoresRepository ganadoresRepository,
                                   CompeticionRepository competicionRepository,
                                   PaisesRepository paisesRepository) {

        return args -> {

            log.info("Preloading " + equiposRepository.save(new Equipos("Madrid", "España", "Barcelona", "TBD")));
            log.info("Preloading " + equiposRepository.save(new Equipos("Barcelona", "España", "Madrid", "TBD")));
            log.info("Preloading " + equiposRepository.save(new Equipos("Munich","Alemania","Borussia","TBD")));
            log.info("Preloading " + equiposRepository.save(new Equipos("Borussia", "Alemania","Munich","TBD")));

            Long BarcelonaId = equiposRepository.buscarEquipo("Barcelona").get().getId();
            Long MadridId = equiposRepository.buscarEquipo("Madrid").get().getId();
            Long MunichId = equiposRepository.buscarEquipo("Munich").get().getId();
            Long BorussiaId = equiposRepository.buscarEquipo("Borussia").get().getId();

            log.info("Preloading " + competicionRepository.save(new Competicion("Europa Champions League")));

            Long CompId = competicionRepository.buscarCompeticion("Europa Champions League").get().getIdCompeticion();

            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1955/1956", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1956/1957", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1957/1958", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1958/1959", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1959/1960", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1965/1966", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1997/1998", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1999/2000", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2001/2002", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2013/2014", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2015/2016", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2016/2017", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2017/2018", MadridId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1991/1992", BarcelonaId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2005/2006", BarcelonaId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2008/2009", BarcelonaId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2010/2011", BarcelonaId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2014/2015", BarcelonaId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1973/1974", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1974/1975", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1975/1976", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2000/2001", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2012/2013", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "2019/2020", MunichId)));
            log.info("Preloading " + ganadoresRepository.save(new Ganadores(CompId, "1996/1997", BorussiaId)));

            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId, "España")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Inglaterra")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Italia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Alemania")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Francia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Portugal")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Rusia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Paises Bajos")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Grecia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Turquia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Ucrania")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Belgica")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Escocia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Suiza")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Noruega")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Rumania")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Republica Checa")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Austria")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Dinamarca")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Suecia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Croacia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Israel")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Bielorrusia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Chipre")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Serbia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Eslovenia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Eslovaquia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Polonia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Bulgaria")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Hungria")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Finlandia")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Kazajistan")));
            log.info("Preloading " + paisesRepository.save(new PaisesAdmitidos(CompId,"Azerbaiyan")));


        };
    }
}

