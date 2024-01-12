package com.lucasvllba.moviesapi.mapper;

import com.lucasvllba.moviesapi.model.Movie;

public class MovieMapper {
    
    public static void setAll(Movie data, Movie modifiedMovie){
        data.setDuration(modifiedMovie.getDuration());
        data.setGender(modifiedMovie.getGender());
        data.setPremiereDate(modifiedMovie.getPremiereDate());
        data.setTitle(modifiedMovie.getTitle());
    }
}
