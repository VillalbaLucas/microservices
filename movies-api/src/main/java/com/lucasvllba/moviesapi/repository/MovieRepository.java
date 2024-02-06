package com.lucasvllba.moviesapi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Movie;

@Repository
public interface MovieRepository extends BaseRepository<Movie, Long> {
    public List<Movie> findAllByDirectorId(Long directorId);
    public List<Movie> findAllByActorsId(Long actorId);
}
