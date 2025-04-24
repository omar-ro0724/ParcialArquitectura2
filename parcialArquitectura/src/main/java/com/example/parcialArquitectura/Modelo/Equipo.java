package com.example.parcialArquitectura.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Equipo;
    private String nombre;
    private String ciudad;
    private LocalDate fundacion;

    public int getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(int id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Entrenador> entrenadores;
}
