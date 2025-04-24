package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Partido;

import java.util.List;
import java.util.Map;

public interface PartidoServicio {
    List<Partido> listarPartidos();
    Integer totalGolesPorEquipo(Integer idEquipo);
    List<Map<String, Object>> resultadosPartidosConNombres();
    Partido guardar(Partido partido);
}
