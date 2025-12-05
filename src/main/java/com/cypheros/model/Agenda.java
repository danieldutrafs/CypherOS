package com.cypheros.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Agenda {

    private int idCompromisso;
    private String nomeCompromisso;
    private String descricaoCompromisso;
    private LocalDate dataInicio;
    private LocalTime horaInicio;
    private LocalDate dataFim;
    private LocalTime horaFim;

    public Agenda() {}

    public Agenda(String nomeCompromisso, int idCompromisso, String descricaoCompromisso,
                  LocalDate dataInicio, LocalTime horaInicio,
                  LocalDate dataFim, LocalTime horaFim) {

        this.nomeCompromisso = nomeCompromisso;
        this.idCompromisso = idCompromisso;
        this.descricaoCompromisso = descricaoCompromisso;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        this.dataFim = dataFim;
        this.horaFim = horaFim;
    }

    public int getIdCompromisso() {
        return idCompromisso;
    }

    public void setIdCompromisso(int idCompromisso) {
        this.idCompromisso = idCompromisso;
    }

    public String getNomeCompromisso() {
        return nomeCompromisso;
    }

    public void setNomeCompromisso(String nomeCompromisso) {
        this.nomeCompromisso = nomeCompromisso;
    }

    public String getDescricaoCompromisso() {
        return descricaoCompromisso;
    }

    public void setDescricaoCompromisso(String descricaoCompromisso) {
        this.descricaoCompromisso = descricaoCompromisso;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String toString() {
        return "com.cypheros.model.Agenda{" +
                "idCompromisso=" + idCompromisso +
                ", nomeCompromisso='" + nomeCompromisso + '\'' +
                ", descricaoCompromisso='" + descricaoCompromisso + '\'' +
                ", dataInicio=" + dataInicio +
                ", horaInicio=" + horaInicio +
                ", dataFim=" + dataFim +
                ", horaFim=" + horaFim +
                '}';
    }
}
