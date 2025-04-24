package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.EstadisticasJugador;

import java.util.List;

public interface EstadisticaJugadorServicio {
    List<EstadisticasJugador> listarEstadisticas();
    EstadisticasJugador guardar(EstadisticasJugador estadistica);
}
