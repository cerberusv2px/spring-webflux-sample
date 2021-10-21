package com.example.springfluxsample.domain;

import com.example.springfluxsample.core.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto<Long> {

    private String name;
    private String email;
}
