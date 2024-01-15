package com.lucasvllba.personsapi.service;

import org.springframework.stereotype.Service;

import com.lucasvllba.personsapi.model.Actor;
import com.lucasvllba.personsapi.repository.BaseRepository;

@Service
public class ActorService extends BaseService<Actor, Long> {

    public ActorService(BaseRepository<Actor, Long> baseRepo) {
        super(baseRepo);
    }
}
