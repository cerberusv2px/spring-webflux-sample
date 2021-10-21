package com.example.springfluxsample.data;

import org.mapstruct.Mapper;

import com.example.springfluxsample.core.BaseMapper;
import com.example.springfluxsample.domain.UserDto;

@Mapper(componentModel = BaseMapper.SPRING_MODEL)
public abstract class UserMapper extends BaseMapper<User, UserDto> {

}
