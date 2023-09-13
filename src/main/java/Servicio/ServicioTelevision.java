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
public class ServicioTelevision extends ServicioElectrodomestico {
    
    public Television crearTelevisor(){
        Electrodomestico t = new Electrodomestico();
        System.out.print("Tamaño en pulgadas > ");
        int tam = leer.nextInt();
        System.out.print("Posee TDT? S para si, otro valor para no > ");
        boolean tdt = false;
        char r = leer.next().toUpperCase().charAt(0);
        if(r == 'S')
            tdt = true;
        double precio = precioFinal(t.getPeso(),t.getConsumoEnergetico(),tam,tdt);
        return new Television(tam, tdt, precio, t.getColor(),t.getConsumoEnergetico(),
                t.getPeso());
    }
    
    private double precioFinal(double peso, char cE, int tam, boolean tdt) {
        double precio = super.precioFinal(peso, cE);
        double tarifaTamano = (precio * .30);
        
        if(tam > 40)
            precio += tarifaTamano;
        if(tdt)
            precio += 500;
        return precio;
    }
  
}
