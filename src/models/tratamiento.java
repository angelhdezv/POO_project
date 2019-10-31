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
public class tratamiento {
    dVeterinario doctor = new dVeterinario();
    
    ArrayList <especificacion> especificaciones = new ArrayList<>();
    
    public tratamiento() {
    }
    public dVeterinario getDoctor() {
        return doctor;
    }

    public void setDoctor(dVeterinario doctor) {
        this.doctor = doctor;
    }

    public ArrayList<especificacion> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(ArrayList<especificacion> especificaciones) {
        this.especificaciones = especificaciones;
    }
   

    

}
