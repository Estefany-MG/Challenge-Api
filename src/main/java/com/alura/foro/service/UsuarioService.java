package com.alura.foro.service;

import com.alura.foro.model.Usuario;
import com.alura.foro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario registrar(Usuario usuario) {
        usuario.setContrasena(bCryptPasswordEncoder.encode(usuario.getContrasena()));
        return usuarioRepository.save(usuario);
    }

    public Usuario encontrarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
