package com.egg.herencia_ej2_electrodomestico;

import Entidad.*;
import Servicio.*;
/**
 *
 * @author zero
 */
public class Herencia_Ej2_Electrodomestico {

    public static void main(String[] args) {
        ServicioLavadora sL = new ServicioLavadora();
        ServicioTelevision sT = new ServicioTelevision();
        Lavadora l1 = sL.crearLavadora();
        Television t1 = sT.crearTelevisor();
        System.out.println(l1 + " \n" + t1);
    }
}
