package com.lucasvllba.personsapi.repository;

import org.springframework.stereotype.Repository;

import com.lucasvllba.personsapi.model.Director;

@Repository
public interface DirectorRepository extends BaseRepository<Director, Long> {
    
}
