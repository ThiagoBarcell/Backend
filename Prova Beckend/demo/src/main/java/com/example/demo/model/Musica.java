package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;

@Document("musicas")
@AllArgsConstructor

public class Musica{
    @Id
     private String id;
     private String titulo;
     private String artista;
     private String album;
     private String genero;
     private String compositor;
     private Integer anoLancamento;


    public String getArtista() {
        return artista;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
