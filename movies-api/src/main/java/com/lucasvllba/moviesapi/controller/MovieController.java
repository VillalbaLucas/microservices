package com.lucasvllba.moviesapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvllba.moviesapi.model.Movie;
import com.lucasvllba.moviesapi.model.enums.CineGender;
import com.lucasvllba.moviesapi.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

   @Autowired
   private MovieService movieService;

   @PostMapping("")
   public ResponseEntity<?> save(@RequestBody Movie movie) {
      movieService.save(movie);
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
   }

   @GetMapping("")
   public ResponseEntity<?> getAll() {
      return ResponseEntity.ok().body(movieService.findAll());
   }
   //Get by
   @GetMapping("/{id}")
   public ResponseEntity<?> getById(@PathVariable Long id) {
      return ResponseEntity.ok().body(movieService.findById(id));
   }

   @GetMapping("/gender")
   public ResponseEntity<?> getByGender(@RequestParam CineGender gender){
      return ResponseEntity.ok().body(movieService.findByGender(gender));
   }

   @GetMapping("/title")
   public ResponseEntity<?> getByTitle(@RequestParam String title){
      return ResponseEntity.ok().body(movieService.findByTitle(title));
   }
   
   @PutMapping("/{id}")
   public ResponseEntity<?> modifyMovie(@PathVariable Long id, @RequestBody Movie movie){
      return ResponseEntity.ok().body(movieService.modify(id, movie));
   }
   // proporciona los directores de la pelicula
   @GetMapping("/by-director/{directorId}")
   public ResponseEntity<?> getAllByDirectorId(@PathVariable Long directorId){
      return ResponseEntity.ok().body(movieService.getAllByDirectorId(directorId));
   }
   // proporciona los actores de la pelicula
   @GetMapping("/by-actor/{actorId}")
   public ResponseEntity<?> getAllByActorId(@PathVariable Long actorId) {
       return ResponseEntity.ok().body(movieService.findAllByActorsId(actorId));
   }
   
}
