package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.model.Musica;
import com.example.demo.service.MusicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/musicas")
public class MusicaController {
    
    @Autowired
    private MusicaService service;

    @GetMapping
    public ResponseEntity<List<Musica>> getAll() {
        var listMusic = service.getAll();
        return new ResponseEntity<>(listMusic, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Musica>> getById(String id) {
        var music = service.getById(id);
        return new ResponseEntity<>(music, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Musica> save(@RequestBody @Valid Musica musica) {
        var music = service.save(musica);
        return new ResponseEntity<>(music, HttpStatus.CREATED);
    }
}
