package com.alura.foro.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @ManyToOne
    private Usuario autor;
    private String curso;

    // Getters y setters
}
