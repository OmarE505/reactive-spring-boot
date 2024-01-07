package com.omarE505.reactivespringboot.services;

import com.omarE505.reactivespringboot.models.Person;
import com.omarE505.reactivespringboot.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Flux<Person> findAll() {
        return personRepository.findAll();
    }

    public Mono<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    public Mono<Person> save(Person person) {
        return personRepository.save(person);
    }
}
