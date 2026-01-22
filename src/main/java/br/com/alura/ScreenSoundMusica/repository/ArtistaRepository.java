package br.com.alura.ScreenSoundMusica.repository;

import br.com.alura.ScreenSoundMusica.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
