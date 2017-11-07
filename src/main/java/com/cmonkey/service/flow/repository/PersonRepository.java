package com.cmonkey.service.flow.repository;

import com.cmonkey.service.flow.domain.Person;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonRepository {
    public Flux<Object> save(Publisher<Person> personStream) {

        return null;
    }

    public Flux<Person> findAll() {
        return null;
    }

    public Mono<Person> findOne(String id) {
        return null;
    }
}
