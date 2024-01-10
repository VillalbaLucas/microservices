package com.lucasvllba.moviesapi.model;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Temporal;

import com.lucasvllba.moviesapi.model.enums.CineGender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public abstract class Cinematography {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate premiereDate; 
    @Enumerated(EnumType.STRING)
    private CineGender gender;

}
