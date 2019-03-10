/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 * Clase que hereda atributos de una padre que a su vez hereda de otra padre.
 * @author fetec
 */
public class Jet extends VehiculoMotorizado{
    
    private int cantidadMotor;

    public Jet(int cantidadMotor, String tipoGasolina, String marca, String modelo) {
        super(tipoGasolina, marca, modelo);
        this.cantidadMotor = cantidadMotor;
    }
        
    public void metodoJet(){
        System.out.println("Este es el metodo propio del Jet");
    }

    public int getCantidadMotor() {
        return cantidadMotor;
    }

    public void setCantidadMotor(int cantidadMotor) {
        this.cantidadMotor = cantidadMotor;
    }
    
    
}
