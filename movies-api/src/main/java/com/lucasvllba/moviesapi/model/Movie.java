package com.lucasvllba.moviesapi.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder
public class Movie extends Cinematography {
    private int duration;
}
