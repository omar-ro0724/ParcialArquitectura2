package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Jugador;
import com.example.parcialArquitectura.Repositorios.JugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServicioImpl implements JugadorServicio {

    @Autowired
    private JugadorRepositorio jugadorRepositorio;

    @Override
    public List<Jugador> listarJugadores() {
        return jugadorRepositorio.findAll();
    }

    @Override
    public List<Jugador> obtenerJugadores(Integer idEquipo) {
        return jugadorRepositorio.findJugadoresByEquipo(idEquipo);
    }

    @Override
    public List<Jugador> conMasDeXGoles(Integer goles) {
        return jugadorRepositorio.findJugadoresConMasDeXGoles(goles);
    }

    @Override
    public Jugador guardar(Jugador jugador) {
        return jugadorRepositorio.save(jugador);
    }
}
