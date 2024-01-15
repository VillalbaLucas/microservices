package com.lucasvllba.moviesapi.service;

import org.springframework.stereotype.Service;

import com.lucasvllba.moviesapi.mapper.SeriesMapper;
import com.lucasvllba.moviesapi.model.Series;
import com.lucasvllba.moviesapi.repository.BaseRepository;

@Service
public class SeriesService extends BaseServiceImpl<Series, Long> {

    public SeriesService(BaseRepository<Series, Long> baseRepo) {
        super(baseRepo);
    }

    public Object modify(Long id, Series series) {
        Series data = findById(id);
        SeriesMapper.setAll(data, series);
        save(data);
        return data;
    }
}
