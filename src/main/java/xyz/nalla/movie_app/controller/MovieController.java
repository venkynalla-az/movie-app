package xyz.nalla.movie_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.nalla.movie_app.entity.Movie;
import xyz.nalla.movie_app.service.MovieService;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/movies")
    public List<Movie> findAllMovies(){
        return service.getMovies();
    }

    @GetMapping("/movieByYear/{year}")
    public Movie findMovieByYear(@PathVariable int year){
        return service.getMovieByYear(year);
    }

    @GetMapping("/movieByTitle/{title}")
    public Movie findMovieByTitle(@PathVariable String title){
        return service.getMovieByTitle(title);
    }
}
