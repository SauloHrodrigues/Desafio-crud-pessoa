package com.desafio_pessoas02.Pessoa02.web.controllers;

import com.desafio_pessoas02.Pessoa02.core.domain.log.Log;
import com.desafio_pessoas02.Pessoa02.web.facades.LogAplicationFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/pessoas/logs")
public class LogController {

    private final LogAplicationFacade facade;

    @GetMapping
    public ResponseEntity<List<Log>> getLogs(){
        return ResponseEntity.ok(facade.getLogs());
    }
}
