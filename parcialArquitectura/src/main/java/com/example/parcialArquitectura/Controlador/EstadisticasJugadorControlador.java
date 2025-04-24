package com.example.parcialArquitectura.Controlador;

import com.example.parcialArquitectura.Modelo.EstadisticasJugador;
import com.example.parcialArquitectura.Servicios.EstadisticaJugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadisticas")
public class EstadisticasJugadorControlador {

    @Autowired
    private EstadisticaJugadorServicio estadisticaJugadorServicio;

    @GetMapping
    public List<EstadisticasJugador> listar() {
        return estadisticaJugadorServicio.listarEstadisticas();
    }

    @PostMapping
    public EstadisticasJugador guardar(@RequestBody EstadisticasJugador estadistica) {
        return estadisticaJugadorServicio.guardar(estadistica);
    }
}
