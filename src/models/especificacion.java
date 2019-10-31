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
public class especificacion {
    String descripcion;
    medicamento med;

    public especificacion() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public medicamento getMed() {
        return med;
    }

    public void setMed(medicamento med) {
        this.med = med;
    }
    
    
}
