/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidades.Rectangulo;

/**
 *
 * @author rebek
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo().crearRectangulo();
        System.out.println("La superficie del rectangulo es: " + r1.superficie());
        System.out.println("El perimetro del rectangulo es: "+ r1.perimetro());
        r1.dibujo();
    }
    
}
