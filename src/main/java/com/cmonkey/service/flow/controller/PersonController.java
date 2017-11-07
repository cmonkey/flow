package com.cmonkey.service.flow.controller;

import com.cmonkey.service.flow.domain.Person;
import com.cmonkey.service.flow.repository.PersonRepository;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/person")
    Mono<Void> create(@RequestBody Publisher<Person> personStream){
        return this.personRepository.save(personStream).then();
    }

    @GetMapping("/person")
    Flux<Person> list(){
        return this.personRepository.findAll();
    }

    @GetMapping("/person/{id}")
    Mono<Person> findById(@PathVariable String id){
        return this.personRepository.findOne(id);
    }
}
