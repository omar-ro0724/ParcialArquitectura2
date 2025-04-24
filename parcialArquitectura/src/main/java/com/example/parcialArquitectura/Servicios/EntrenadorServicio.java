package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Entrenador;

import java.util.List;

public interface EntrenadorServicio {
    List<Entrenador> listarEntrenadores();
    Entrenador guardar(Entrenador entrenador);
}
