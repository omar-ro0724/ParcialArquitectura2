package com.example.parcialArquitectura.Modelo;

import jakarta.persistence.*;

@Entity
public class EstadisticasJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_esatdistica;
    private  Integer minutos_jugados;
    private Integer goles;
    private Integer asistencias;
    private Integer tarjetas_amarillas;
    private Integer tarjetas_rojas;

    public Integer getId_esatdistica() {
        return id_esatdistica;
    }

    public void setId_esatdistica(Integer id_esatdistica) {
        this.id_esatdistica = id_esatdistica;
    }

    public Integer getMinutos_jugados() {
        return minutos_jugados;
    }

    public void setMinutos_jugados(Integer minutos_jugados) {
        this.minutos_jugados = minutos_jugados;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(Integer tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public Integer getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(Integer tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @ManyToOne
    @JoinColumn(name ="id_partido")
    private Partido partido;



}
