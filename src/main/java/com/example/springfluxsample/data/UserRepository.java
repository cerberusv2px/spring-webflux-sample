package com.example.springfluxsample.data;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springfluxsample.core.BaseRepository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    @Query("SELECT * from USERS where name = $1")
    Flux<User> findByName(String name);
}
