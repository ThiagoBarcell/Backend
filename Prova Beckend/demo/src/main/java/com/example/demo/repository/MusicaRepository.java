package com.example.demo.repository;
import com.example.demo.model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
