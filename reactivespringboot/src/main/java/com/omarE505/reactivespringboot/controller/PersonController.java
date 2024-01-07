package com.omarE505.reactivespringboot.controller;

import com.omarE505.reactivespringboot.models.Person;
import com.omarE505.reactivespringboot.services.PersonService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public Flux<Person> getAll() {
        return personService.findAll();
    }

    @PostMapping("/persons")
    public Mono<Person> save(@RequestBody Person person) {
        return personService.save(person);
    }
}
