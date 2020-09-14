package com.github.sdziubka.test.endpoint.mapping;

import com.github.sdziubka.test.endpoint.dto.UserDto;
import com.github.sdziubka.test.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto mapToDto(User src);

    User mapToEntity(UserDto src);
}