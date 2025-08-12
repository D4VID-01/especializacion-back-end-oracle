package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApí = new ConsumoAPI();
		var json = consumoApí.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=367d7215");
		System.out.println(json);

		ConvierteDatos conversor = new ConvierteDatos();
		var datos= conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);

		json = consumoApí.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=367d7215");
		DatosEpisodio episodios = conversor.obtenerDatos(json, DatosEpisodio.class);
		System.out.println(episodios);

		List<DatosTemporadas> temporadas = new ArrayList<>();
		for (int i = 1; i <= datos.totalDeTemporadas() ; i++) {
			json = consumoApí.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=" + i + "&apikey=367d7215");
			var datosTemporada = conversor.obtenerDatos(json, DatosTemporadas.class);
			temporadas.add(datosTemporada);
		}

		temporadas.forEach(System.out::println);


	}
}
