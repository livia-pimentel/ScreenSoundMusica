package br.com.alura.ScreenSoundMusica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "musicas")
public class Musica {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne
    private  Artista artista;

    // Construtores
    public Musica() {

    }

    public Musica(String nomeMusica) {
        this.titulo = nomeMusica;
    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Música='" + titulo + '\'' +
                ", artista=" + artista.getNome();
    }
}
