package com.omarE505.reactivespringboot.repositories;

import com.omarE505.reactivespringboot.models.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
}
