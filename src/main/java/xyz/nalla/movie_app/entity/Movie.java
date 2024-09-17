package xyz.nalla.movie_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "movie")
public class Movie {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private int year;
    private String genre;
    private String coverUrl;
    private String summary;

}
