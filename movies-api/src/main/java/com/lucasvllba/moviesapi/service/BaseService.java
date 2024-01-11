package com.lucasvllba.moviesapi.service;

import java.util.List;

import com.lucasvllba.moviesapi.model.Cinematography;

public interface BaseService<E extends Cinematography, ID> {
    public void save(E entity);
    public void deleteById(ID id);
    public List<E> findAll();
    public E findById(ID id);
}
