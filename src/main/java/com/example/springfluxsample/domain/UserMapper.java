package com.example.springfluxsample.domain;

import org.mapstruct.Mapper;

import com.example.springfluxsample.core.BaseMapper;
import com.example.springfluxsample.api.UserDto;
import com.example.springfluxsample.data.User;

@Mapper(componentModel = BaseMapper.SPRING_MODEL)
public abstract class UserMapper extends BaseMapper<User, UserDto> {

}
