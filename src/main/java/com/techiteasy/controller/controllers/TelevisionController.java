package com.techiteasy.controller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/televisions")
public class TelevisionController {

    @GetMapping
    public ResponseEntity<String> getAllTelevisions() {
        return ResponseEntity.ok("All televisions");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable int id) {
        return ResponseEntity.ok("Television #" + id);
    }

    @PostMapping
    public ResponseEntity<String> createTelevision() {
        return ResponseEntity.created(null).body("Created television");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable int id) {
        return ResponseEntity.ok("Updated television #" + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTelevision(@PathVariable int id) {
        return ResponseEntity.noContent().build();
    }

}
