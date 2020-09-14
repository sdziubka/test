package com.github.sdziubka.test.service;

import com.github.sdziubka.test.entity.User;
import com.github.sdziubka.test.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> find(String login) {
        return userRepository.findByLogin(login)
                .doOnSuccess(user -> LOG.info(String.format("find(%s) -> %s", login, user)));
    }

    public Mono<User> create(User user) {
        return userRepository.save(user)
                .doOnSuccess(savedUser -> LOG.info(String.format("create() -> %s", savedUser)));
    }

    public Mono<User> edit(User user) {
        return userRepository.save(user)
                .doOnSuccess(editedUser -> LOG.info(String.format("edit() -> %s", editedUser)));
    }
}
