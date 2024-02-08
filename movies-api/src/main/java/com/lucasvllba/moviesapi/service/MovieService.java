package com.lucasvllba.moviesapi.service;

import org.springframework.stereotype.Service;

import com.lucasvllba.moviesapi.mapper.MovieMapper;
import com.lucasvllba.moviesapi.model.Movie;
import com.lucasvllba.moviesapi.repository.BaseRepository;

@Service
public class MovieService extends BaseServiceImpl<Movie, Long>{

    public MovieService(BaseRepository<Movie, Long> baseRepo) {
        super(baseRepo);
    }

    public Movie modify(Long id, Movie movie){
        Movie data = findById(id);
        MovieMapper.setAll(data, movie);
        save(data);
        return data;
    }

}
