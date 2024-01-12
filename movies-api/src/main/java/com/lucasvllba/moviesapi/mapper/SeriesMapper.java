package com.lucasvllba.moviesapi.mapper;

import com.lucasvllba.moviesapi.model.Series;

public class SeriesMapper {
    public static void setAll(Series data, Series modifiedSeries){
        data.setGender(modifiedSeries.getGender());
        data.setPremiereDate(modifiedSeries.getPremiereDate());
        data.setTitle(modifiedSeries.getTitle());
        data.setSeasons(modifiedSeries.getSeasons());
    }
}
