package com.lucasvllba.moviesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasvllba.moviesapi.model.Cinematography;

@Repository
public interface CinematographyRepository extends JpaRepository<Cinematography, Long> {
}
