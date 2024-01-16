package com.lucasvllba.personsapi.dto;

import java.time.LocalDate;
import java.util.Set;

import com.lucasvllba.personsapi.dto.enums.CineGender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder
public class MovieDto {
    private String title;
    private Set<CineGender> gender;
    private LocalDate premiereDate; 
    private int duration;
}
