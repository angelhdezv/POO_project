/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author alumno
 */
public class padecimiento {
    String descripcion;
    tratamiento Trt;

    public padecimiento() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public tratamiento getTrt() {
        return Trt;
    }

    public void setTrt(tratamiento Trt) {
        this.Trt = Trt;
    }
    
}
