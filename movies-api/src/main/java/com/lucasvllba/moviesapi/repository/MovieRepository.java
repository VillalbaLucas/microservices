package com.lucasvllba.moviesapi.repository;

import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Movie;
import java.util.List;
import com.lucasvllba.moviesapi.model.enums.CineGender;


@Repository
public interface MovieRepository extends BaseRepository<Movie, Long> {
    public List<Movie> findByGender(CineGender gender);
    public List<Movie> findByTitle(String title);
}
