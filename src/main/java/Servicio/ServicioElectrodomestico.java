/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.*;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioElectrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Electrodomestico crearElectrodomestico(){
        Electrodomestico eD = new Electrodomestico();
        
        System.out.print("Bienvenido al asistente de creacion de electrodomestico\nIngrese el Peso del producto >");
        eD.setPeso(leer.nextDouble());
        System.out.print("Ingrese el tipo de consumo energetico (A-F) >");
        eD.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0)));
        System.out.print("Ingresa el color del articulo");
        eD.setColor(comprobarColor(leer.next().toLowerCase()));
        eD.setPrecio(precioFinal(eD.getPeso(), eD.getConsumoEnergetico()));
        
        return eD;
    }
    
    protected double precioFinal(double peso, char consumoEnergetico){
        
        double precio = 1000;
        
        switch(consumoEnergetico){
            case 'A': precio += 1000;break;
            case 'B': precio += 800;break;
            case 'C': precio += 600;break;
            case 'D': precio += 500;break;
            case 'E': precio += 300;break;
            case 'F': precio += 100;break;
        }
        
        if(peso >= 1 && peso <= 19){
            precio += 100;
        } else if(peso >= 20 && peso <= 49){
            precio += 500;
        } else if(peso >= 50 && peso <= 79){
            precio += 800;
        } else if(peso >= 80){
            precio += 1000;
        }
        
        return precio;
    }
    
    private String comprobarColor(String c){
        switch (c){
            case "blanco", "negro", "rojo", "azul", "gris." -> {
                return c;
            }
            default -> {
                return "blanco";
            }
        }
    }
    
    
    private char comprobarConsumoEnergetico(char cE){
        switch (cE){
            case 'A', 'B', 'C', 'D', 'E', 'F' -> {
                return cE;
            }
            default -> {
                return 'F';
            }
            }
        }
    }
}
