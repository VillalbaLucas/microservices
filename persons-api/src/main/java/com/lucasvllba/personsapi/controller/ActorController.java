package com.lucasvllba.personsapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasvllba.personsapi.model.Actor;
import com.lucasvllba.personsapi.service.ActorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("api/v1/actors")
public class ActorController {

    private ActorService service;

    public ActorController(ActorService service){
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

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Actor actor) {
        service.save(actor);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@PathVariable Long id, @RequestBody Actor actor) {
        return ResponseEntity.ok().body(service.modify(actor, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
