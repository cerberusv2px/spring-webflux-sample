package com.example.springfluxsample.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.example.springfluxsample.core.BaseRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

}
