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
public class duenio extends persona{
    mascota mascota; 

    public duenio() {
    }

    public mascota getMascota() {
        return mascota;
    }

    public void setMascota(mascota mascota) {
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
