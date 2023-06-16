/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import entidad.Libro;

/**
 *
 * @author rebek
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro().nuevoLibro();
        Libro l2 = new Libro().nuevoLibro();
        System.out.println(l1.toString());
        System.out.println(l2.toString());

        
    }
    
}
