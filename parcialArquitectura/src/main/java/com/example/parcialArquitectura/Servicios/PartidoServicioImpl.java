package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Partido;
import com.example.parcialArquitectura.Repositorios.PartidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PartidoServicioImpl implements PartidoServicio{

    @Autowired
    private PartidoRepositorio partidoRepositorio;

    @Override
    public List<Partido> listarPartidos() {
        return partidoRepositorio.findAll();
    }

    @Override
    public Integer totalGolesPorEquipo(Integer idEquipo) {
        return partidoRepositorio.totalGolesEquipo(idEquipo);
    }

    @Override
    public List<Map<String, Object>> resultadosPartidosConNombres() {
        return partidoRepositorio.resultadosPartidosConNombres();
    }

    @Override
    public Partido guardar(Partido partido) {
        return partidoRepositorio.save(partido);
    }
}
