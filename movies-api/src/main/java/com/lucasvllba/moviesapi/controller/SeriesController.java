package com.lucasvllba.moviesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvllba.moviesapi.model.Series;
import com.lucasvllba.moviesapi.model.enums.CineGender;
import com.lucasvllba.moviesapi.service.SeriesService;

@RestController
@RequestMapping("/api/v1/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Series series) {
        seriesService.save(series);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(seriesService.findAll());
    }

    // Get by
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(seriesService.findById(id));
    }

    @GetMapping("/gender")
    public ResponseEntity<?> getByGender(@RequestParam CineGender gender) {
        return ResponseEntity.ok().body(seriesService.findByGender(gender));
    }

    @GetMapping("/title")
    public ResponseEntity<?> getByTitle(@RequestParam String title) {
        return ResponseEntity.ok().body(seriesService.findByTitle(title));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modifyMovie(@PathVariable Long id, @RequestBody Series series) {
        return ResponseEntity.ok().body(seriesService.modify(id, series));
    }

    @GetMapping("/by-director/{directorId}")
    public ResponseEntity<?> getAllByDirectorId(@PathVariable Long directorId) {
        return ResponseEntity.ok().body(seriesService.getAllByDirectorId(directorId));
    }

    // proporciona los actores de la pelicula
    @GetMapping("/by-actor/{actorId}")
    public ResponseEntity<?> getAllByActorId(@PathVariable Long actorId) {
        return ResponseEntity.ok().body(seriesService.findAllByActorsId(actorId));
    }
}
