package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Equipo;
import com.example.parcialArquitectura.Repositorios.EquipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServicioImpl implements EquipoServicio {
    @Autowired
    private EquipoRepositorio equipoRepositorio;

    @Override
    public List<Equipo> listarEquipos() {
        return equipoRepositorio.findAll();
    }
    @Override
    public Equipo guardar(Equipo equipo){
        return equipoRepositorio.save(equipo);
    }
}
