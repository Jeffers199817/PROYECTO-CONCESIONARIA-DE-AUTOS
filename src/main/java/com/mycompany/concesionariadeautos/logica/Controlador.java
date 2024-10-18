/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionariadeautos.logica;

import com.mycompany.concesionariadeautos.persistencia.ControladoraPersi;
import java.util.List;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class Controlador {
    
    ControladoraPersi controlPersi = new ControladoraPersi();
    

    public void guardaAutomovil(String modelo, String marca, String motor, String color, String placa, String cantidadDePuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadDePuertas);
        
      controlPersi.guardarAutomovil(auto);   
            
    }

    public List<Automovil> traerAutos() {

       return controlPersi.traerAutos();
    }

    public void eliminarAuto(int num_auto) {
        controlPersi.eliminarAuto(num_auto);
        }


    public void modificarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String placa, String cantidadDePuertas) {

        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadDePuertas);
        
        controlPersi.modificarAuto(auto);
        


    }

    public Automovil traerAuto(int id) {
        
        return controlPersi.traerAuto(id);

    }

}
