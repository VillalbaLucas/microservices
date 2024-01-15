package com.lucasvllba.personsapi.repository;

import org.springframework.stereotype.Repository;

import com.lucasvllba.personsapi.model.Actor;

@Repository
public interface ActorRepository extends BaseRepository<Actor, Long>  {
    
}
