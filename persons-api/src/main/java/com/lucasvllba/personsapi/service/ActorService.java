package com.lucasvllba.personsapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.client.MovieClient;
import com.lucasvllba.personsapi.client.SeriesClient;
import com.lucasvllba.personsapi.dto.MovieDto;
import com.lucasvllba.personsapi.dto.SeriesDto;
import com.lucasvllba.personsapi.model.Actor;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public class ActorService extends BaseService<Actor, Long> {

    private MovieClient movieClient;
    private SeriesClient seriesClient;

    public ActorService(BaseRepository<Actor, Long> baseRepo, MovieClient movieClient, SeriesClient seriesClient) {
        super(baseRepo);
        this.movieClient = movieClient;
        this.seriesClient=seriesClient;
    }

    public List<MovieDto> findAllMovies(Long id) {
        return movieClient.getAllByActorId(id);
    }

    public List<SeriesDto> findAllSeries(Long id) {
        return seriesClient.getAllByActorId(id);
    }
}
