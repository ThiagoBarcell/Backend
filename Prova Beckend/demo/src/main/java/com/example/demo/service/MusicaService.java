package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Musica;
import com.example.demo.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    
    @Autowired
    private MusicaRepository repository;

    public Musica save(Musica musica) {
        return repository.save(musica);
    }

    public List<Musica> getAll() {
        return repository.findAll();
    }

    public Optional<Musica> getById(String id){
        return repository.findById(id);
    }
}
