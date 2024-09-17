package xyz.nalla.movie_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.nalla.movie_app.entity.Movie;
import xyz.nalla.movie_app.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> getMovies(){
        return repository.findAll();
    }

    public Movie getMovieByYear(int releaseYear){
        return  repository.findByYear(releaseYear);
    }

    public Movie getMovieByTitle(String title){
        return  repository.findByTitle(title);
    }
}
