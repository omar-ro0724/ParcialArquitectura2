package com.example.parcialArquitectura.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id_partido;
    private LocalDate fecha;
    private String estadio;
    private Integer golesLocal;
    private Integer golesVisita;


    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;


    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL)
    private List<EstadisticasJugador> estadisticas;



}
