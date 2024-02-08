package com.lucasvllba.personsapi.dto;

import java.time.LocalDate;
import java.util.Set;

import com.lucasvllba.personsapi.dto.enums.CineGender;

public class BaseMovieAndSeries {
    private String title;
    private Set<CineGender> gender;
    private LocalDate premiereDate;
}
