package com.example.parcialArquitectura.Controlador;

import com.example.parcialArquitectura.Modelo.Equipo;
import com.example.parcialArquitectura.Servicios.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoControlador {
    @Autowired
    private EquipoServicio equipoServicio;

    @GetMapping
    public List<Equipo> listarEquipos() {
        return equipoServicio.listarEquipos();
    }

    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return equipoServicio.guardar(equipo);
    }
}

