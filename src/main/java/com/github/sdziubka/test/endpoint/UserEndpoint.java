package com.github.sdziubka.test.endpoint;

import com.github.sdziubka.test.endpoint.dto.UserDto;
import com.github.sdziubka.test.endpoint.mapping.UserMapper;
import com.github.sdziubka.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/user")
public class UserEndpoint {

    private UserService userService;

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Mono<UserDto> find(@RequestParam("login") String login) {
        return userService.find(login).map(user -> userMapper.mapToDto(user));
    }

    @PostMapping
    public Mono<UserDto> create(@RequestBody UserDto userDto) {
        return userService.create(userMapper.mapToEntity(userDto)).map(user -> userMapper.mapToDto(user));
    }

    @PutMapping
    public Mono<UserDto> edit(@RequestBody UserDto userDto) {
        return userService.edit(userMapper.mapToEntity(userDto)).map(user -> userMapper.mapToDto(user));
    }
}
