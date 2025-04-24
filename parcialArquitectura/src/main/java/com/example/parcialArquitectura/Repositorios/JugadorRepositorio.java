package com.example.parcialArquitectura.Repositorios;

import com.example.parcialArquitectura.Modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JugadorRepositorio extends JpaRepository<Jugador,Integer> {
    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findJugadoresByEquipo(@Param("idEquipo") Integer idEquipo);

    @Query(value = """
        SELECT j.* FROM jugador j 
        JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador 
        GROUP BY j.id_jugador 
        HAVING SUM(e.goles) > :golesMinimos
        """, nativeQuery = true)
    List<Jugador> findJugadoresConMasDeXGoles(@Param("golesMinimos") Integer golesMinimos);
}

