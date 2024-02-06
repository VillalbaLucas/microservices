package com.lucasvllba.moviesapi.mapper;

import com.lucasvllba.moviesapi.model.Movie;

public class MovieMapper {
    
    public static void setAll(Movie data, Movie modifiedMovie){
        if (modifiedMovie.getDuration() != 0)
            data.setDuration(modifiedMovie.getDuration());
        if(modifiedMovie.getGender() != null)
            data.setGender(modifiedMovie.getGender());
        if(modifiedMovie.getPremiereDate() != null)
            data.setPremiereDate(modifiedMovie.getPremiereDate());
        if(modifiedMovie.getTitle() != null)
            data.setTitle(modifiedMovie.getTitle());
        if(modifiedMovie.getDirectorId() != null)
            data.setDirectorId(modifiedMovie.getDirectorId());
        if(!modifiedMovie.getActorsId().isEmpty())
            data.setActorsId(modifiedMovie.getActorsId());
    }
}
