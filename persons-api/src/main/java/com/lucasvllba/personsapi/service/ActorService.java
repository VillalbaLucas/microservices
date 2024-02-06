package com.lucasvllba.personsapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.client.MovieClient;
import com.lucasvllba.personsapi.dto.MovieDto;
import com.lucasvllba.personsapi.model.Actor;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public class ActorService extends BaseService<Actor, Long> {

    private BaseRepository<Actor, Long> baseRepo;
    private MovieClient movieClient;

    public ActorService(BaseRepository<Actor, Long> baseRepo, MovieClient movieClient) {
        super(baseRepo);
        this.movieClient = movieClient;
    }

    public List<MovieDto> findAllMovies(Long id) {
        return movieClient.getAllByActorId(id);
    }
}
