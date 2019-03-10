/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author fetec
 */
public class Tabla extends Vehiculo{
    
    private float largoTabla;

    public Tabla(float largoTabla, String marca, String modelo) {
        super(marca, modelo);
        this.largoTabla = largoTabla;
    }
        
    public void metodoTabla(){
        System.out.println("Este es el metodo propio de la tabla");
    }

    public float getLargoTabla() {
        return largoTabla;
    }

    public void setLargoTabla(float largoTabla) {
        this.largoTabla = largoTabla;
    }
    
    
}
