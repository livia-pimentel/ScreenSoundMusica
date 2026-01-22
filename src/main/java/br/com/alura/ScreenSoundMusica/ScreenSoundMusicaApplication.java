package br.com.alura.ScreenSoundMusica;

import br.com.alura.ScreenSoundMusica.principal.Principal;
import br.com.alura.ScreenSoundMusica.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundMusicaApplication implements CommandLineRunner {
	@Autowired
	private ArtistaRepository repositorio;


	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundMusicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
