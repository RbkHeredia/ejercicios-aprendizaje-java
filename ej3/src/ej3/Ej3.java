/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidad.Operacion;

/**
 *
 * @author rebek
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion().crearOperacion();
        System.out.println("La suma es: " + op.suma());
        System.out.println("La resta es: "+op.restar());
        System.out.println("La multiplicacion es: " + op.multiplicar());
        System.out.println("La division es: " + op.dividir());
    }
    
}
