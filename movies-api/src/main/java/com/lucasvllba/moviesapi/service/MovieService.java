package com.lucasvllba.moviesapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasvllba.moviesapi.mapper.MovieMapper;
import com.lucasvllba.moviesapi.model.Movie;
import com.lucasvllba.moviesapi.model.enums.CineGender;
import com.lucasvllba.moviesapi.repository.BaseRepository;
import com.lucasvllba.moviesapi.repository.MovieRepository;

@Service
public class MovieService extends BaseServiceImpl<Movie, Long>{

    @Autowired
    private MovieRepository movieRepo;

    public MovieService(BaseRepository<Movie, Long> baseRepo) {
        super(baseRepo);
    }

    public List<Movie> findByGender(CineGender gender) {
        return movieRepo.findByGender(gender);
    }

    public List<Movie> findByTitle(String title) {
        return movieRepo.findByTitle(title);
    }

    public Movie modify(Long id, Movie movie){
        Movie data = findById(id);
        MovieMapper.setAll(data, movie);
        save(data);
        return data;
    }
}
