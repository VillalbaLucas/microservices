package com.lucasvllba.moviesapi.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.lucasvllba.moviesapi.model.enums.CineGender;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Cinematography implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CineGender gender;
    private String title;
    private LocalDate premiereDate; 
}
