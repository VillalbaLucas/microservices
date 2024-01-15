package com.lucasvllba.personsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.lucasvllba.personsapi.model.Persona;

@NoRepositoryBean
public interface BaseRepository<E extends Persona, ID> extends JpaRepository<E, ID> {
}
