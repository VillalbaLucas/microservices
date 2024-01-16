package com.lucasvllba.personsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.client.MovieClient;
import com.lucasvllba.personsapi.dto.MovieDto;
import com.lucasvllba.personsapi.model.Director;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public class DirectorService extends BaseService<Director, Long>{

    @Autowired
    private MovieClient movieClient;

    public DirectorService(BaseRepository<Director, Long> baseRepo) {
        super(baseRepo);
    }

    public List<MovieDto> getAllMovies(Long id) {
        List<MovieDto> movies = movieClient.getAllByDirectorId(id);
        return movies;
    }
}
