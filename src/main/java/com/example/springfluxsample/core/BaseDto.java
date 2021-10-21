package com.example.springfluxsample.core;

import lombok.Data;

@Data
public abstract class BaseDto<PK> {

    private PK id;
}
