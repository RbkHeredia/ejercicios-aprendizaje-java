/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import Entidades.Cuenta;

/**
 *
 * @author rebek
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuentaNueva = new Cuenta().crearCuenta();
        cuentaNueva.consultarDatos();
        cuentaNueva.ingresar(500);
        cuentaNueva.extraccionRapida(50);
        cuentaNueva.consultarSaldo();
    }
    
}
