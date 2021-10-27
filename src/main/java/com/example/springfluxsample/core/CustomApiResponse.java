package com.example.springfluxsample.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Flux;

@Data
@Getter
@Setter
@AllArgsConstructor
public class CustomApiResponse{
    private String message;
    private int status;
    private Flux<Object> data;
}
