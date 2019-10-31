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
public class mascota {
    String nombre;
   
    ArrayList<padecimiento> padecimientos;

    public mascota() {
        padecimientos = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<padecimiento> getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(ArrayList<padecimiento> padecimientos) {
        this.padecimientos = padecimientos;
    }
    
    
}
