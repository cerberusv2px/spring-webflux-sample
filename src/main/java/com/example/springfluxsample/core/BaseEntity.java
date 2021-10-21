package com.example.springfluxsample.core;

import java.io.Serializable;

import lombok.Data;

@Data
public abstract class BaseEntity<T extends Serializable> {

    private T id;

}
