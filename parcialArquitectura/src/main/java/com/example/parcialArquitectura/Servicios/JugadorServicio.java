package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Jugador;

import java.util.List;

public interface JugadorServicio {
    List<Jugador> listarJugadores();
    List<Jugador> obtenerJugadores(Integer idEquipo);
    List<Jugador> conMasDeXGoles(Integer goles);
    Jugador guardar(Jugador jugador);
}
