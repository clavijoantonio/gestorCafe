package com.antoniodev.gestorcafe.domain.models;

import java.time.LocalDate;

public class Lote {
    private long id;
    private String codigo;
    private long farmId;
    private String nombre;
    private String area;
    private String cultivoId;
    private LocalDate fechaSiembra;
    private LocalDate fechaCosecha;
    private float densidaSiembra;
    private float altitud;
    private String tipoSuelo;
    private String estado;
    private String obsevaciones;

    public Lote(long id, String codigo, long farmId, String nombre, String area, String cultivoId, LocalDate fechaSiembra, LocalDate fechaCosecha, float densidaSiembra, float altitud, String tipoSuelo, String estado, String obsevaciones) {
        this.id = id;
        this.codigo = codigo;
        this.farmId = farmId;
        this.nombre = nombre;
        this.area = area;
        this.cultivoId = cultivoId;
        this.fechaSiembra = fechaSiembra;
        this.fechaCosecha = fechaCosecha;
        this.densidaSiembra = densidaSiembra;
        this.altitud = altitud;
        this.tipoSuelo = tipoSuelo;
        this.estado = estado;
        this.obsevaciones = obsevaciones;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public long getFarmId() {
        return farmId;
    }

    public void setFarmId(long farmId) {
        this.farmId = farmId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCultivoId() {
        return cultivoId;
    }

    public void setCultivoId(String cultivoId) {
        this.cultivoId = cultivoId;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public LocalDate getFechaCosecha() {
        return fechaCosecha;
    }

    public void setFechaCosecha(LocalDate fechaCosecha) {
        this.fechaCosecha = fechaCosecha;
    }

    public float getDensidaSiembra() {
        return densidaSiembra;
    }

    public void setDensidaSiembra(float densidaSiembra) {
        this.densidaSiembra = densidaSiembra;
    }

    public float getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObsevaciones() {
        return obsevaciones;
    }

    public void setObsevaciones(String obsevaciones) {
        this.obsevaciones = obsevaciones;
    }
}
