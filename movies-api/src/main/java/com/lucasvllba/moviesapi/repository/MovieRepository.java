package com.lucasvllba.moviesapi.repository;

import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Movie;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Long> {
}
