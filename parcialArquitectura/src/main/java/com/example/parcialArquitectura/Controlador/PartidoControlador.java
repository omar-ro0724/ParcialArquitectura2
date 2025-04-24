package com.example.parcialArquitectura.Controlador;

import com.example.parcialArquitectura.Modelo.Partido;
import com.example.parcialArquitectura.Servicios.PartidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/partidos")
public class PartidoControlador {

    @Autowired
    private PartidoServicio partidoServicio;

    @GetMapping
    public List<Partido> listar() {
        return partidoServicio.listarPartidos();
    }

    @PostMapping
    public Partido guardar(@RequestBody Partido partido) {
        return partidoServicio.guardar(partido);
    }

    @GetMapping("/goles-equipo/{idEquipo}")
    public Integer totalGoles(@PathVariable Integer idEquipo) {
        return partidoServicio.totalGolesPorEquipo(idEquipo);
    }

    @GetMapping("/resultados")
    public List<Map<String, Object>> resultados() {
        return partidoServicio.resultadosPartidosConNombres();
    }
}
