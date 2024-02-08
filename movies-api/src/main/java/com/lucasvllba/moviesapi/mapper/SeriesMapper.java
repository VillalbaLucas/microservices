package com.lucasvllba.moviesapi.mapper;

import com.lucasvllba.moviesapi.model.Series;

public class SeriesMapper {
    public static void setAll(Series data, Series modifiedSeries){
        if(modifiedSeries.getGender() != null)
            data.setGender(modifiedSeries.getGender());
        if(modifiedSeries.getPremiereDate() != null)
            data.setPremiereDate(modifiedSeries.getPremiereDate());
        if(modifiedSeries.getTitle() != null)
            data.setTitle(modifiedSeries.getTitle());
        if(modifiedSeries.getSeasons() != 0)
            data.setSeasons(modifiedSeries.getSeasons());
        if(modifiedSeries.getActorsId() != null)
            data.setActorsId(modifiedSeries.getActorsId());
        if(modifiedSeries.getDirectorId() != null)
            data.setDirectorId(modifiedSeries.getDirectorId());
    }
}
