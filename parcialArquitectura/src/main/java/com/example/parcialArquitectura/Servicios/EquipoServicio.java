package com.example.parcialArquitectura.Servicios;

import com.example.parcialArquitectura.Modelo.Equipo;

import java.util.List;

public interface EquipoServicio {
    List<Equipo> listarEquipos();
    Equipo guardar(Equipo equipo);
}
