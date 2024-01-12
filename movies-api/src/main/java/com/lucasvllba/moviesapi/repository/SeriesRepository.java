package com.lucasvllba.moviesapi.repository;

import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Series;

@Repository
public interface SeriesRepository extends BaseRepository<Series, Long> {
}
