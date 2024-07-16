package com.alura.foro.controller;

import com.alura.foro.model.Tema;
import com.alura.foro.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {
    @Autowired
    private TemaService temaService;

    @GetMapping
    public List<Tema> listar() {
        return temaService.listar();
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Tema> crear(@RequestBody Tema tema) {
        return new ResponseEntity<>(temaService.crear(tema), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        temaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
