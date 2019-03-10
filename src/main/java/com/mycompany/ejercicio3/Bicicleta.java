/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 * Clase bicicleta con atributos de la padre y metodo propio.
 * @author fetec
 */
public class Bicicleta extends Vehiculo{
    
    private int numeroEngranaje;

    public Bicicleta(int numeroEngranaje, String marca, String modelo) {
        super(marca, modelo);
        this.numeroEngranaje = numeroEngranaje;
    }

    
    public void metodoBicicleta() {
        System.out.println("Este es el metodo propio de la bicicleta");
    }

    public int getNumeroEngranaje() {
        return numeroEngranaje;
    }

    public void setNumeroEngranaje(int numeroEngranaje) {
        this.numeroEngranaje = numeroEngranaje;
    }   
    
    
}
