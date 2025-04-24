package com.example.parcialArquitectura.Controlador;

import com.example.parcialArquitectura.Modelo.Entrenador;
import com.example.parcialArquitectura.Servicios.EntrenadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EntrenadorControlador {
    @Autowired
    private EntrenadorServicio entrenadorServicio;

    @GetMapping
    public List<Entrenador> listar() {
        return entrenadorServicio.listarEntrenadores();
    }

    @PostMapping
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return entrenadorServicio.guardar(entrenador);
    }
}
