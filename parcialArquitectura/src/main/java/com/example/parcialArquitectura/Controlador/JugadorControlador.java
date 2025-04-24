package com.example.parcialArquitectura.Controlador;

import com.example.parcialArquitectura.Modelo.Jugador;
import com.example.parcialArquitectura.Servicios.JugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorControlador {
    @Autowired
    private JugadorServicio jugadorServicio;

    @GetMapping
    public List<Jugador> listarJugadores() {
        return jugadorServicio.listarJugadores();
    }

    @PostMapping
    public Jugador guardar(@RequestBody Jugador jugador) {
        return jugadorServicio.guardar(jugador);
    }

    @GetMapping("/por-equipo/{idEquipo}")
    public List<Jugador> porEquipo(@PathVariable Integer idEquipo) {
        return jugadorServicio.obtenerJugadores(idEquipo);
    }

    @GetMapping("/goleadores")
    public List<Jugador> conMasGoles(@RequestParam Integer goles) {
        return jugadorServicio.conMasDeXGoles(goles);
    }
}
