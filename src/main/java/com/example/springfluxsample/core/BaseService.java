package com.example.springfluxsample.core;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public abstract class BaseService<T, I> implements Service<T, I> {

    protected final BaseRepository<T, I> repository;

    protected BaseService(BaseRepository<T, I> repository) {
        this.repository = repository;
    }

    @Override
    public Mono<T> save(T t) {
        return repository.save(t);
    }

    @Override
    public Flux<T> saveAll(List<T> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Mono<T> findById(I i) {
        return repository.findById(i);
    }

    @Override
    public Flux<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Void> delete(T t) {
        return repository.delete(t);
    }

    @Override
    public Mono<Void> deleteById(I i) {
        return repository.deleteById(i);
    }
}
