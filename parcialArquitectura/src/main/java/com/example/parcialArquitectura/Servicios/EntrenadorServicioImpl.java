package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Entrenador;
import com.example.parcialArquitectura.Repositorios.EntrenadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServicioImpl implements EntrenadorServicio{
    @Autowired
    private EntrenadorRepositorio entrenadorRepositorio;

    @Override
    public List<Entrenador> listarEntrenadores() {
        return entrenadorRepositorio.findAll();
    }

    @Override
    public Entrenador guardar(Entrenador entrenador) {
        return entrenadorRepositorio.save(entrenador);
    }
}
