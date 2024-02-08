package com.lucasvllba.moviesapi.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder
public class Series extends Cinematography {
    private int seasons;
    @Column(name="actors_id")
    @ElementCollection
    @CollectionTable(name = "movie_actor", joinColumns = @JoinColumn(name="movie_id"))
    private List<Long> actorsId;
}
