package com.example.springfluxsample.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springfluxsample.core.BaseMapper;
import com.example.springfluxsample.core.CrudController;
import com.example.springfluxsample.core.Service;
import com.example.springfluxsample.domain.UserDto;

@RestController
@RequestMapping("/users")
public class UserController extends CrudController<User, UserDto, Long> {

    protected UserController(
        Service<User, Long> service,
        BaseMapper<User, UserDto> mapper) {
        super(service, mapper);
    }
}
