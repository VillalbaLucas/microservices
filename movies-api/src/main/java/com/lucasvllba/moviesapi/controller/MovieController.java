package com.lucasvllba.moviesapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvllba.moviesapi.model.Movie;
import com.lucasvllba.moviesapi.model.enums.CineGender;
import com.lucasvllba.moviesapi.service.MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

   @Autowired
   private MovieService movieService;

   @PostMapping("")
   public void save(@RequestBody Movie movie) {
      movieService.save(movie);
   }

   @GetMapping("")
   public List<Movie> getAll() {
      return movieService.findAll();
   }

   @GetMapping("/gender")
   public List<Movie> getByGender(@RequestParam CineGender gender){
      return movieService.findByGender(gender);
   }

   @GetMapping("/{id}")
   public ResponseEntity<?> getAll(@PathVariable Long id) {
      return ResponseEntity.ok().body(movieService.findById(id));
   }
}
