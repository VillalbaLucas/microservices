package com.lucasvllba.personsapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvllba.personsapi.model.Director;
import com.lucasvllba.personsapi.service.DirectorService;


@RestController
@RequestMapping("api/v1/directors")
public class DirectorController {

    private DirectorService service;

    public DirectorController(DirectorService service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @GetMapping("/{id}/movies")
    public ResponseEntity<?> getAllMovies(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getAllMovies(id));
    }
    
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Director director){
        service.save(director);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@PathVariable Long id, @RequestBody Director director){
        return ResponseEntity.ok().body(service.modify(director,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
