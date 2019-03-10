/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal en la que se agregan objetos a la lista de tipo vehiculo,
 * y posteriormente se imprimen segun su instancia propia.
 * @author fetec
 */
public class Principal {
    
    List <Vehiculo> listado=new ArrayList<>();
    
    Vehiculo tabla=new Tabla((float) 5.0,"Flip","2016");
    Vehiculo bicicleta= new Bicicleta(10,"Whithepeople","2018");
    Vehiculo carro=new Carro(2,"ACPM","Mitsubitchi","2019");
    Vehiculo jet=new Jet(4,"ATF","Boeing","747");
    
    public Principal(){
        listado.add(jet);
        listado.add(carro);
        listado.add(bicicleta);
        listado.add(tabla);
        
        for (Vehiculo i : listado) {
            if(i instanceof Carro){
                Carro c=(Carro)i;
                c.metodoCarro();
                c.info();
                System.out.println("Marca: "+c.getMarca());
                System.out.println("Modelo: "+c.getModelo());
                System.out.println("Gasolina: "+c.getTipoGasolina());
                System.out.println("Tamaño motor: "+c.getTamanoMotor());
            }
            else if(i instanceof Jet){
                Jet j=(Jet)i;
                j.metodoJet();
                j.info();
                System.out.println("Marca: "+j.getMarca());
                System.out.println("Modelo: "+j.getModelo());
                System.out.println("Gasolina: "+j.getTipoGasolina());
                System.out.println("Cantidad motores: "+j.getCantidadMotor());
            }
            else if(i instanceof Bicicleta){
                Bicicleta b=(Bicicleta)i;
                b.metodoBicicleta();
                b.info();
                System.out.println("Marca: "+b.getMarca());
                System.out.println("Modelo: "+b.getModelo());
                System.out.println("Cantidad engranajes: "+b.getNumeroEngranaje());
            }
            else if(i instanceof Tabla){
                Tabla t=(Tabla)i;
                t.metodoTabla();
                t.info();
                System.out.println("Marca: "+t.getMarca());
                System.out.println("Modelo: "+t.getModelo());
                System.out.println("Largo de tabla: "+t.getLargoTabla());
            }
        }
    }
}
