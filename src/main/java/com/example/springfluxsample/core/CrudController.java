package com.example.springfluxsample.core;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public abstract class CrudController<E extends BaseEntity, D, I> {

    protected final Service<E, I> service;
    protected final BaseMapper<E, D> mapper;

    protected CrudController(Service<E, I> service,
        BaseMapper<E, D> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    protected boolean canCreate() {
        return true;
    }

    protected boolean canUpdate() {
        return true;
    }

    protected boolean canDelete() {
        return true;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<D> save(@RequestBody E e) {
        return service.save(e).map(mapper::mapEntityToDto);
    }

    @PostMapping("/create-all")
    public Flux<D> saveAll(@RequestBody List<E> e) {
        return service.saveAll(e).map(mapper::mapEntityToDto);
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<D>> findById(@PathVariable I id) {
        Mono<D> e = service.findById(id).map(mapper::mapEntityToDto);
        return e.map(ResponseEntity::ok)
            .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("")
    public Flux<D> findAll() {
//        ResponseEntity<Object> o = null;
//        Flux<D> e = service.findAll().map(mapper::mapEntityToDto);
//        e.map(data -> data).subscribe(d -> {
//
//        })
////        e.subscribe(data -> {
////           final ResponseEntity<Object> o = ResponseHandler.generateResponse("success", HttpStatus.OK, data);
////
////        }, error -> {
////            o = ResponseHandler.generateResponse("failre", HttpStatus.NOT_FOUND, null);
////        });
////        return o;
//        //return e.map(ResponseEntity::ok).defaultIfEmpty(ResponseEntity.notFound().build());
//       // return e;
//        return null;
        return service.findAll().map(mapper::mapEntityToDto);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteById(@PathVariable I id) {
        return service.deleteById(id)
            .map(r -> ResponseEntity.ok().<Void>build())
            .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
