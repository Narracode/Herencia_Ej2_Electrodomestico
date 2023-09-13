/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.*;
/**
 *
 * @author zero
 */
public class ServicioLavadora extends ServicioElectrodomestico {
    
    public Lavadora crearLavadora(){
        Electrodomestico l = super.crearElectrodomestico();
        
        System.out.print("Carga maxima de ropa >");
        double carga = leer.nextDouble();
        l.setPrecio(precioFinal(l.getPeso(),l.getConsumoEnergetico(),carga));
        return new Lavadora(carga, l.getPrecio(), l.getColor(), l.getConsumoEnergetico(), l.getPeso());
    }
    
    protected double precioFinal(double peso, char consumoEnergetico, double carga){
        double precio = super.precioFinal(peso, consumoEnergetico);
        if(carga > 30)
            precio += 500;
        return precio;
    }
}
