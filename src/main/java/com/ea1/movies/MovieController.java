package com.ea1.movies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
public class MovieController {
  private List<Movie> movies = new ArrayList<>();

  public MovieController() {
    movies.add(new Movie(1, "Oppenheimer", 2023, "Cristopher Nolan", "Drama", "Drama biográfico de corte histórico basado en American Prometheus, la biografía escrita por Kai Bird y Martin J. Sherwin en torno a la figura del científico J. Robert Oppenheimer y su rol en la creación y desarrollo de la bomba atómica. 16 de julio de 1945, en el desierto de Nuevo México se detona en secreto la primera bomba atómica. En tiempos de guerra, el brillante físico estadounidense Julius Robert Oppenheimer (Cillian Murphy), al frente del proyecto Manhattan, lidera los ensayos nucleares para construir la bomba atómica para su país"));
    movies.add(new Movie(2, "Interestelar", 2014, "Cristopher Nolan", "Ciencia ficción", "En un futuro cercano, la humanidad se enfrenta a la extinción debido a la escasez de recursos. Un grupo de exploradores se embarca en un viaje interestelar en busca de un nuevo hogar para la raza humana, enfrentándose a agujeros de gusano, viajes en el tiempo y desafíos cósmicos."));
    movies.add(new Movie(3, "El Origen", 2010, "Cristopher Nolan", "Ciencia ficción", "Dom Cobb es un ladrón especializado en el arte de la extracción: robar secretos valiosos del interior del subconsciente durante el estado de sueño. Su habilidad le ha convertido en un codiciado activo en el mundo del espionaje corporativo, pero también le ha convertido en un fugitivo internacional. Ahora, Cobb tiene una oportunidad para redimirse con un último trabajo, pero para ello deberá hacer lo contrario: implantar una idea en la mente de alguien. Una tarea aún más complicada que le obligará a adentrarse en el peligroso mundo del \"origen\"."));
    movies.add(new Movie(4, "Isla Siniestra", 2010, "Martin Scorsese", "Drama", "En los años 50, dos agentes federales investigan la desaparición de una paciente en un hospital psiquiátrico en una isla remota. A medida que profundizan en la investigación, descubren perturbadoras verdades sobre el lugar y se enfrentan a sus propios demonios internos."));
    movies.add(new Movie(5, "La Llegada", 2016, "Denis Villeneuve", "Ciencia ficción", "Cuando misteriosas naves extraterrestres comienzan a aparecer en la Tierra, la experta lingüista Louise Banks es reclutada por el ejército para comunicarse con los alienígenas y descifrar sus intenciones. A medida que trabaja para desentrañar el lenguaje de los visitantes, Louise se encuentra en una carrera contra el tiempo para evitar una potencial guerra global."));
  }

  @GetMapping("/movies/{id}")
  public Movie getMovieById(@PathVariable int id) {
    for (Movie movie : movies) {
      if (movie.getId() == id) {
        return movie;
      }
    }

    return null;
  }
  
}
