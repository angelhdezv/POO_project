/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.*;

/**
 *
 * @author alumno
 */
public class metodoInscripcion {
    public void altaDoctor(String n){
        dVeterinario d = new dVeterinario();
        d.setNombre(n);
    }
    public void altaMascota(String nduenio, String nmascota){
        duenio duenio = new duenio();
        duenio.setNombre(nduenio);
        mascota m = new  mascota();
        m.setNombre(nmascota);
        duenio.setMascota(m);
    }
}
