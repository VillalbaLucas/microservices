package com.lucasvllba.moviesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.lucasvllba.moviesapi.model.enums.CineGender;

@NoRepositoryBean
public interface BaseRepository<E, ID> extends JpaRepository<E , ID>{
    public List<E> findByGender(CineGender gender);
    public List<E> findByTitle(String title);
    public List<E> findAllByDirectorId(Long directorId);
    public List<E> findAllByActorsId(Long actorId);
}
