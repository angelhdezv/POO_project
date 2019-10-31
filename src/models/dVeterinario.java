/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class dVeterinario extends persona{
    ArrayList<mascota> mascotas;

    public dVeterinario() {
        mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
