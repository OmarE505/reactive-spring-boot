package com.omarE505.reactivespringboot;

import com.omarE505.reactivespringboot.models.Person;
import com.omarE505.reactivespringboot.services.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactivespringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactivespringbootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PersonService service) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                service.save(
                        Person.builder()
                                .firstName("Omar" + i)
                                .lastName("Emad" + i)
                                .build()
                ).subscribe();
            }
        };
    }

}
