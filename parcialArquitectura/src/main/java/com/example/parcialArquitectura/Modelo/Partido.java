package com.example.parcialArquitectura.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_partido;
    private LocalDate fecha;
    private String estadio;

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public int getGoles_visita() {
        return goles_visita;
    }

    public void setGoles_visita(int goles_visita) {
        this.goles_visita = goles_visita;
    }

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;
    private int goles_local;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;
    private int  goles_visita;

}
