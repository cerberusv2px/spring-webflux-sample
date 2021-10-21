package com.example.springfluxsample.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springfluxsample.core.BaseRepository;
import com.example.springfluxsample.core.BaseService;
import com.example.springfluxsample.data.User;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@Slf4j
@Transactional
public class UserService extends BaseService<User, Long> {


    protected UserService(
        @Autowired BaseRepository<User, Long> repository) {
        super(repository);
    }


    public Flux<User> fetchUsers(List<Long> userIds) {
        return Flux.fromIterable(userIds)
            .parallel()
            .runOn(Schedulers.boundedElastic())
            .flatMap(repository::findById)
            .ordered((u1, u2) -> (int) (u2.getId() - u1.getId()));
    }
}
