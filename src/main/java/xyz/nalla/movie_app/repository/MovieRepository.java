package xyz.nalla.movie_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.nalla.movie_app.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findByYear(int releaseYear);

    Movie findByTitle(String title);
}
