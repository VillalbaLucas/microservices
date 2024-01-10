package com.lucasvllba.moviesapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.lucasvllba.moviesapi.model.Cinematography;
import com.lucasvllba.moviesapi.repository.CinematographyRepository;

@Service
public class CinematographyService {

    private CinematographyRepository cineRepo;

    public void Cinematography(CinematographyRepository cineRepo){
        this.cineRepo = cineRepo;
    }

    public List<Cinematography> findAll(){
        return cineRepo.findAll(); 
    }
    public Cinematography findById(Long id){
        return cineRepo.findById(id).orElseThrow();
    }
    public void save(Cinematography cine){
        cineRepo.save(cine);
    }
    public void deleteById(Long id){
        cineRepo.deleteById(id);
    }

    
}
