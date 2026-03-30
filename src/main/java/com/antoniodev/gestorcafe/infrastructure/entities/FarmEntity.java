package com.antoniodev.gestorcafe.infrastructure.entities;

import com.antoniodev.gestorcafe.domain.models.Farm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
public class FarmEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private long propietario_id;
    private long ubicacion_id;
    private float area_total;
    private boolean cerficacion_organica;
    private Date fecha_aquisicion;
    private String obsevaciones;
    private boolean activa;



    public FarmEntity(long id, String nombre, long propietario_id, long ubicacion_id, float area_total, boolean cerficacion_organica, Date fecha_aquisicion, String obsevaciones, boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.propietario_id = propietario_id;
        this.ubicacion_id = ubicacion_id;
        this.area_total = area_total;
        this.cerficacion_organica = cerficacion_organica;
        this.fecha_aquisicion = fecha_aquisicion;
        this.obsevaciones = obsevaciones;
        this.activa = activa;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPropietario_id() {
        return propietario_id;
    }

    public void setPropietario_id(long propietario_id) {
        this.propietario_id = propietario_id;
    }

    public long getUbicacion_id() {
        return ubicacion_id;
    }

    public void setUbicacion_id(long ubicacion_id) {
        this.ubicacion_id = ubicacion_id;
    }

    public float getArea_total() {
        return area_total;
    }

    public void setArea_total(float area_total) {
        this.area_total = area_total;
    }

    public boolean isCerficacion_organica() {
        return cerficacion_organica;
    }

    public void setCerficacion_organica(boolean cerficacion_organica) {
        this.cerficacion_organica = cerficacion_organica;
    }

    public Date getFecha_aquisicion() {
        return fecha_aquisicion;
    }

    public void setFecha_aquisicion(Date fecha_aquisicion) {
        this.fecha_aquisicion = fecha_aquisicion;
    }

    public String getObsevaciones() {
        return obsevaciones;
    }

    public void setObsevaciones(String obsevaciones) {
        this.obsevaciones = obsevaciones;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
