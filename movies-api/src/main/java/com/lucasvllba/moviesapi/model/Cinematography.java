package com.lucasvllba.moviesapi.model;

import java.time.LocalDate;
import java.util.Set;

import com.lucasvllba.moviesapi.model.enums.CineGender;

import jakarta.persistence.ElementCollection;
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
public class Cinematography{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ElementCollection(targetClass = CineGender.class)
    @Enumerated(EnumType.STRING)
    private Set<CineGender> gender;
    private LocalDate premiereDate; 
}
