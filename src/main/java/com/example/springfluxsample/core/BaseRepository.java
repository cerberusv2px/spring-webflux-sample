package com.example.springfluxsample.core;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@NoRepositoryBean
public interface BaseRepository<T, I> extends ReactiveCrudRepository<T, I> {

}
