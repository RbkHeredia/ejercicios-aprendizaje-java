/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Entidad.Circunferencia;

/**
 *
 * @author rebek
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia().crearCircunferencia();
        System.out.println("El area es: ");
        System.out.println(c1.area());
        System.out.println("El perimetro es: ");
        System.out.println(c1.perimetro());
        System.out.println(c1.toString());
    }
    
}
