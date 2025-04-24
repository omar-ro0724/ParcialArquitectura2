package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.EstadisticasJugador;
import com.example.parcialArquitectura.Repositorios.EstadisticasJugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadisticaJugadorServicioImpl implements EstadisticaJugadorServicio{
    @Autowired
    private EstadisticasJugadorRepositorio estadisticasJugadorRepositorio;

    @Override
    public List<EstadisticasJugador> listarEstadisticas() {
        return estadisticasJugadorRepositorio.findAll();
    }

    @Override
    public EstadisticasJugador guardar(EstadisticasJugador estadistica) {
        return estadisticasJugadorRepositorio.save(estadistica);
    }
}
