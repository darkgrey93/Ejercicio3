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
public class Carro extends VehiculoMotorizado{
    
    private float tamanoMotor;

    public Carro(float tamanoMotor, String tipoGasolina, String marca, String modelo) {
        super(tipoGasolina, marca, modelo);
        this.tamanoMotor = tamanoMotor;
    }
    
    public void metodoCarro(){
        System.out.println("Este es el metodo propio del carro");
    }

    public float getTamanoMotor() {
        return tamanoMotor;
    }

    public void setTamanoMotor(float tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
    }
    
    
}
