package com.example.parcialArquitectura.Repositorios;

import com.example.parcialArquitectura.Modelo.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface PartidoRepositorio extends JpaRepository<Partido,Integer> {
    @Query(value = """
        SELECT SUM(CASE WHEN equipo_local = :idEquipo THEN goles_local ELSE 0 END + 
                   CASE WHEN equipo_visita = :idEquipo THEN goles_visita ELSE 0 END)
        FROM partido
        """, nativeQuery = true)
    Integer totalGolesEquipo(@Param("idEquipo") Integer idEquipo);

    @Query(value = """
        SELECT p.id_partido, p.fecha, p.goles_local, p.goles_visita,
               el.nombre AS equipo_local, ev.nombre AS equipo_visita
        FROM partido p
        JOIN equipo el ON p.equipo_local = el.id_equipo
        JOIN equipo ev ON p.equipo_visita = ev.id_equipo
        """, nativeQuery = true)
    List<Map<String, Object>> resultadosPartidosConNombres();
}
