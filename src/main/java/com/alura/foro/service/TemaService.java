package com.alura.foro.service;

import com.alura.foro.model.Tema;
import com.alura.foro.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService {
    @Autowired
    private TemaRepository temaRepository;

    public List<Tema> listar() {
        return temaRepository.findAll();
    }

    public Tema crear(Tema tema) {
        return temaRepository.save(tema);
    }

    public void eliminar(Long id) {
        temaRepository.deleteById(id);
    }
}
