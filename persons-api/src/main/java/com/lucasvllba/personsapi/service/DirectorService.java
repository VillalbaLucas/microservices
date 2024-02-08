package com.lucasvllba.personsapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.client.MovieClient;
import com.lucasvllba.personsapi.client.SeriesClient;
import com.lucasvllba.personsapi.dto.MovieDto;
import com.lucasvllba.personsapi.dto.SeriesDto;
import com.lucasvllba.personsapi.model.Director;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public class DirectorService extends BaseService<Director, Long>{

    private MovieClient movieClient;
    private SeriesClient seriesClient;

    public DirectorService(BaseRepository<Director, Long> baseRepo, MovieClient movieCLient, SeriesClient seriesClient) {
        super(baseRepo);
        this.movieClient=movieCLient;
        this.seriesClient=seriesClient;
    }

    public List<MovieDto> getAllMovies(Long id) {
        List<MovieDto> movies = movieClient.getAllByDirectorId(id);
        return movies;
    }

    public List<SeriesDto> findAllSeries(Long id) {
        return seriesClient.getAllByActorId(id);
    }
}
