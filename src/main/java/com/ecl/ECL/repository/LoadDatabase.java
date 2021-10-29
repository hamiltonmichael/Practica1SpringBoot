package com.ecl.ECL.repository;

import com.ecl.ECL.model.Equipos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EquiposRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Equipos("Madrid", "Spain", "Barcelona", "TBD")));
            log.info("Preloading " + repository.save(new Equipos("Barcelona", "Spain", "Madrid", "TBD")));
        };
    }
}

