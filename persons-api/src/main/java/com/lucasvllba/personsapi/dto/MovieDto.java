package com.lucasvllba.personsapi.dto;

import java.time.LocalDate;
import java.util.Set;

import com.lucasvllba.personsapi.dto.enums.CineGender;

public record MovieDto (String title, Set<CineGender> gender, LocalDate premiereDate, int duration) { 

}
