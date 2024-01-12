package com.lucasvllba.moviesapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasvllba.moviesapi.mapper.SeriesMapper;
import com.lucasvllba.moviesapi.model.Series;
import com.lucasvllba.moviesapi.model.enums.CineGender;
import com.lucasvllba.moviesapi.repository.BaseRepository;
import com.lucasvllba.moviesapi.repository.SeriesRepository;

@Service
public class SeriesService extends BaseServiceImpl<Series, Long> {

    @Autowired
    private SeriesRepository seriesRepo;

    public SeriesService(BaseRepository<Series, Long> baseRepo) {
        super(baseRepo);
    }

    public List<Series> findByGender(CineGender gender) {
        return seriesRepo.findByGender(gender);
    }

    public List<Series> findByTitle(String title) {
        return seriesRepo.findByTitle(title);
    }

    public Object modify(Long id, Series series) {
        Series data = findById(id);
        SeriesMapper.setAll(data, series);
        save(data);
        return data;
    }



}
