package com.mariooliver.javareactmovies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//let's spring now that this class represents each document in the movies collection
@Document(collection = "movies")
//Creates all the getters, setters, equals, hash, and toString methods, based on the fields 
@Data
//annotations for creating a constructor that takes all of these args and for creating another that takes none
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String releaseDate;
    private String imdbId;
    private String title;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String>backdrops;
    //cause DB to store only the IDs of the reviews, not the reviews themselves
    @DocumentReference
    private List<Review> reviewIds;

}
