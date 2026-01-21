package br.com.alura.ScreenSoundMusica.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "artistas")
public class Artista {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipo;

    private List<Musica> musicas = new ArrayList<>();

}
