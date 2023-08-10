package com.mariooliver.javareactmovies;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**write DB access methods*/
@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    //Optional tells Java that we may return a null value -> repo.findById() may not find a movie, in which case it will return null
    public Optional<Movie> getMovieById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
