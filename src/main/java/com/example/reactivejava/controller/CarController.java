package com.example.reactivejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping()
    Mono<CarDto> getCarDto() {
        return Mono.just(new CarDto(123L, "test"));
    }
}
