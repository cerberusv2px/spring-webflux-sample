package com.example.springfluxsample.domain;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.springfluxsample.api.UserDTO;
import com.example.springfluxsample.core.BaseMapper;
import com.example.springfluxsample.data.User;

@Mapper(componentModel = BaseMapper.SPRING_MODEL)
public interface UserMapper {

    public static final String SPRING_MODEL = "spring";

    @Mapping(target = "authorities", ignore = true)
    public UserDTO mapEntityToDto(User s);

    @Mapping(target = "authorities", ignore = true)
    public User mapDtoToEntity(UserDTO d);

    @Mapping(target = "authorities", ignore = true)
    public List<UserDTO> mapEntitiesToDtos(List<User> s);

    @Mapping(target = "authorities", ignore = true)
    public List<User> mapDtosToEntities(List<UserDTO> d);
}
