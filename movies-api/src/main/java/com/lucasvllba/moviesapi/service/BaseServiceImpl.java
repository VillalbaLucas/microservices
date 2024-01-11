package com.lucasvllba.moviesapi.service;

import java.util.List;

import com.lucasvllba.moviesapi.model.Cinematography;
import com.lucasvllba.moviesapi.repository.BaseRepository;

public abstract class BaseServiceImpl<T extends Cinematography, ID>  {
    
    protected BaseRepository<T, ID> baseRepo;

    public BaseServiceImpl(BaseRepository<T, ID> baseRepo){
        this.baseRepo = baseRepo;
    }

    // @Override
    public void save(T entity) {
        baseRepo.save(entity);
    }

    // @Override
    public void deleteById(ID id) {
       baseRepo.deleteById(id);
    }

    // @Override
    public List<T> findAll() {
        return baseRepo.findAll();
    }

    // @Override
    public T findById(ID id) {
        return baseRepo.findById(id).get();
    }
}
