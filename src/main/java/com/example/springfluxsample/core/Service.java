package com.example.springfluxsample.core;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Service<T, I> {

    Mono<T> save(T t);

    Flux<T> saveAll(List<T> entities);

    Mono<T> findById(I i);

    Flux<T> findAll();

    Mono<Void> delete(T t);

    Mono<Void> deleteById(I i);

}
