package com.diegolisboajj.strategypattern.controller;

import com.diegolisboajj.strategypattern.strategy.exception.ExceptionResponseDto;
import com.diegolisboajj.strategypattern.strategy.exception.NotFoundNotificationStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionAdvice {

    @ExceptionHandler(value = NotFoundNotificationStrategy.class)
    public ResponseEntity<ExceptionResponseDto> notFoundNotificationStrategy(RuntimeException runtimeException) {
        return new ResponseEntity<>(
                ExceptionResponseDto.builder()
                        .message(runtimeException.getMessage())
                        .status(HttpStatus.NOT_FOUND)
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
