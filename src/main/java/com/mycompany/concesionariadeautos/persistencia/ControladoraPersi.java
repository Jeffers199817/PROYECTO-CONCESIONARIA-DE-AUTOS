/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionariadeautos.persistencia;

import com.mycompany.concesionariadeautos.logica.Automovil;
import com.mycompany.concesionariadeautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class ControladoraPersi {
    
    AutomovilJpaController automovilJpa = new AutomovilJpaController();

    public void guardarAutomovil(Automovil auto) {
        automovilJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {

        return automovilJpa.findAutomovilEntities();
    }

    public void eliminarAuto(int num_auto) {
        try {
            automovilJpa.destroy(num_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    public void modificarAuto(Automovil auto) {
                
        try {
            automovilJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
