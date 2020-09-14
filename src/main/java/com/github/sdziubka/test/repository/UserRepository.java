package com.github.sdziubka.test.repository;

import com.github.sdziubka.test.entity.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {

    @Query("SELECT * FROM user WHERE login = :login")
    Mono<User> findByLogin(String login);
}
