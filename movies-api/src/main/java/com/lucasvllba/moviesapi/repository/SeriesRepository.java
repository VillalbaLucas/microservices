package com.lucasvllba.moviesapi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Series;
import com.lucasvllba.moviesapi.model.enums.CineGender;

@Repository
public interface SeriesRepository extends BaseRepository<Series, Long> {
    public List<Series> findByGender(CineGender gender);
    public List<Series> findByTitle(String title);
}
