/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 * Clase padre con los atributos basicos y metodos de todas las clases
 * @author fetec
 */
public abstract class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void info(){
        System.out.println("Esta es la info general del Vehiculo");
    }
    
    public void metodoVehiculo(){
        System.out.println("Este es el metodo propio de Vehiculo");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
        
    
    
}
