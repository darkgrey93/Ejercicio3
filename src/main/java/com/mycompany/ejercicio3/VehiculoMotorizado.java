/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 * Clase que hereda atributos basicos de la padre y atributos especificos a las hijas.
 * @author fetec
 */
public abstract class VehiculoMotorizado extends Vehiculo{
    
    private String tipoGasolina;

    public VehiculoMotorizado(String tipoGasolina, String marca, String modelo) {
        super(marca, modelo);
        this.tipoGasolina = tipoGasolina;
    }
    
    public void metodoVehiculoMotorizado(){
        System.out.println("Este es el metodo propio de vehiculo motorizado");
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    
    
}
